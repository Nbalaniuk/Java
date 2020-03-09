package func;

import java.util.ArrayList;

public class TeamStreams
{

	public static void main(String[] args)
	{
		
		
		ArrayList<Team> obTList = new ArrayList<>();
		
		
		obTList.add(new Team()
				.setName("Bucks")
				.setCity("Milwakee")
				.setWins(43)
				.setLosses(14)
				.setSalary(131935189));
		
		obTList.add(new Team()
				.setName("Raptors")
				.setCity("Toronto")
				.setWins(43)
				.setLosses(16)
				.setSalary(134848038));
		
		obTList.add(new Team()
				.setName("Pacers")
				.setCity("Indiana")
				.setWins(38)
				.setLosses(20)
				.setSalary(109537295));
		
		obTList.add(new Team()
				.setName("Celtics")
				.setCity("Boston")
				.setWins(37)
				.setLosses(21)
				.setSalary(125136414));
		
		obTList.add(new Team()
				.setName("Sixers")
				.setCity("Philidelphia")
				.setWins(37)
				.setLosses(21)
				.setSalary(115004824));
		
		obTList.add(new Team()
				.setName("Nets")
				.setCity("Brooklyn")
				.setWins(30)
				.setLosses(39)
				.setSalary(118803230));
		
		obTList.add(new Team()
				.setName("Hornets")
				.setCity("Charolette")
				.setWins(27)
				.setLosses(30)
				.setSalary(121427859));
		
		obTList.add(new Team()
				.setName("Pistons")
				.setCity("Detroit")
				.setWins(26)
				.setLosses(30)
				.setSalary(123640374));
		
		
		//Give a list of the top 4 teams by salary.- print out team name and salary
		
		obTList.stream() 
			.sorted((x,y) ->((int) (x.getSalary() - y.getSalary())))
			.limit(4)
			.forEach(x -> System.out.printf("Name: %-12s Salary: $%.2f\n", x.getName(), x.getSalary()));
		
		
		//Give a list of teams sorted by Name that have a winning record - more wins than losses
		//include number of wins and losses and team name
		obTList.stream()
			.sorted((x,y) -> x.getName().compareTo(y.getName()))
			.filter(x -> x.getWins()> x.getLosses())
			.forEach(x-> System.out.printf("Name: %-12s Wins: %d Losses: %d \n",x.getName(),x.getWins(),x.getLosses()));
		
	//Ignore this one	//Teams with a Winning percent of Greater than 70% will have their payroll stay the same for the next year
		//Teams with Win % 50-69% will have payroll increase by 25% next year(Trying to compete)
		//Print out a sorted list by payroll for all the teams given this new stipulation
		obTList.stream()
			.map(x -> { 
				double dVal = x.getWins() / (x.getWins() + x.getLosses()); 
				if(dVal >.5 && dVal<.7)
				{
					 x.setSalary(x.getSalary()*1.25);
					 return x.getSalary();
					 
				}
				else
				{
					 x.setSalary(x.getSalary());
					 return x.getSalary();
				}
				
			})
			.forEach(x -> System.out.printf("%s $%.2f\n", x, x.getSalary()));
		
		
		
		
		
		
		
		
		
		
	}

}
