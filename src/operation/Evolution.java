package operation;

public interface Evolution { //interface for methods of genetic algorithm
	Population evolve(Population population);
	Population crossoverPopulation(Population population);
	Schedule crossoverSchedule(Schedule schedule1, Schedule schedule2);
	Population mutatePopulation(Population population);
	Schedule mutateSchedule(Schedule mutateSchedule);
	Population selectTournamentPopulation(Population population);
}
