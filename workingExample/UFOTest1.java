package workingExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UFOTest1 extends Application
{
	
	private ArrayList<Image> obUFOImages;
	private Canvas obCanvas;
	private GraphicsContext gc;
	
	private Sprite obUFO1;
	private Sprite obLauncher, obMissile;
	

	@Override
	public void start(Stage obStage) throws Exception
	{
		loadImages("images/ufo");
		
		BorderPane obPane = new BorderPane();
		HBox obBottom  =new HBox(35);
		obBottom.setAlignment(Pos.CENTER);
		
		Button obLeft = new Button("Left");
		Button obRight = new Button("Right");
		Button obLaunch = new Button("Launch");
		
		obLeft.setOnAction(e -> Platform.runLater(() -> moveLaunch(-10)));
		obRight.setOnAction(e -> Platform.runLater(() -> moveLaunch(10)));
		obLaunch.setOnAction(e -> Platform.runLater(() -> launchMissile()));
		
		
		
		
		obBottom.getChildren().add(obLeft);
		obBottom.getChildren().add(obLaunch);
		obBottom.getChildren().add(obRight);
		obPane.setBottom(obBottom);
		
		
		
		//Create a canvas to draw on
		obCanvas = new Canvas(300,400);
		this.gc = this.obCanvas.getGraphicsContext2D();
		obPane.setCenter(obCanvas);
		
		obUFO1 = new Sprite(obUFOImages.get(0), 10.0, 20.0);
		Sprite obUFO2 = new Sprite(obUFOImages.get(0), 70.0, 20);
		Sprite obUFO3 = new Sprite(obUFOImages.get(0), 130.0, 20.0);
		Sprite obUFO4 = new Sprite(obUFOImages.get(0), 190.0, 20.0);
		
		obLauncher = new Sprite(new Image("file:images/missile.png"), 150,365);
		obLauncher.render(this.gc);
		

		startTask(obUFO1);
		startTask(obUFO2);
		startTask(obUFO3);
		startTask(obUFO4);
		
		
		obStage.setScene(new Scene(obPane));
		obStage.setTitle("Invasion");
		obStage.show();
		
		
		

	}
	
	public void moveLaunch(int nInc)
	{
		obLauncher.moveX(nInc, this.gc);
	}
	
	public void launchMissile()
	{
		obLauncher.renderNull(this.gc);
		Sprite obMissile = new Sprite(new Image("file:images/missile.png"), obLauncher.getCoors().getX(), obLauncher.getCoors().getY());
		startMissileTask(obMissile);
		
	}
	public void gravity(Sprite obUFO)
	{
		obUFO.moveY(1, this.gc);		
	}
	
	private void track(Sprite obSprite)
	{
		obSprite.moveY(-1, this.gc);
		if (obSprite.intersects(obUFO1))
		{
			Sprite obBoom = new Sprite(new Image("file:images/boom.png"), obSprite.getCoors().getX()-10, obSprite.getCoors().getY()-35);
			Thread obThread = new Thread (() -> doBoomBoom(obBoom));
			obThread.setDaemon(true);
			obThread.start();
			
		}
	}
	
	
	private void doBoomBoom(Sprite obSprite)
	{
		try
		{
			double dOpacity = 1.0;
			while (dOpacity > 0)
			{
				obSprite.renderNull(this.gc);		
				obSprite.setOpacity(dOpacity);
				dOpacity -= .1;
				obSprite.render(this.gc);
				obSprite.getCoors().setY(obSprite.getCoors().getY()+ 3);
				
				Thread.sleep(100);
			}
			
			obSprite.renderNull(this.gc);
			
			
			
			
		}
		catch (InterruptedException exp)
		{
			exp.printStackTrace();
		}
	}
	
	
	private void startMissileTask(Sprite obSprite)
	{
		Thread obThread = new Thread(() -> runMissileTrack(obSprite));
		obThread.setDaemon(true);
		obThread.start();
	}
	
	
	
	private void runMissileTrack(Sprite obSprite)
	{
		try
		{
			while (true)
			{
				if (obSprite.isDead())
				{
					obSprite.renderNull(this.gc);
					break;
				}
				Platform.runLater(() -> track(obSprite));
				Thread.sleep(25);
			}
		}
		catch (InterruptedException exp)
		{
			exp.printStackTrace();
		}
	}
	
	
	
	private void startTask(Sprite obUFO)
	{
		Thread obThread = new Thread(() -> runTask(obUFO));
		obThread.setDaemon(true);
		obThread.start();
		
	}
	
	private void runTask(Sprite obUFO)
	{
		//Handle the different images
		try
		{
			Thread.sleep((int) (Math.random() *2000));
			int nPos = 0;
			while (true)
			{
				if (obUFO.isDead())
				{
					obUFO.renderNull(this.gc);
					break;
				}
				obUFO.setImage(this.obUFOImages.get(nPos % this.obUFOImages.size()));
				nPos++;
				Platform.runLater(() -> gravity(obUFO));
				
				Thread.sleep(25);
			}
		}
		catch(InterruptedException exp)
		{
			exp.printStackTrace();
		}
	}
	
	private void loadImages(String sPath)
	{
		File obDir = new File(sPath);
		if (!obDir.isDirectory())
		{
			return;
		}
		
		this.obUFOImages = new ArrayList<>();
		try
		{
			for (String sVal : obDir.list())
			{
				if (sVal.matches(".*png"))
				{
					File obFile = new File(obDir.getAbsolutePath() + "/" + sVal);
					this.obUFOImages.add(new Image(new FileInputStream(obFile)));
				}
			}
		}
		catch(FileNotFoundException exp)
		{
			exp.printStackTrace();
		}
		
	}
	

	public static void main(String[] args)
	{
		Application.launch(args);

	}

}
