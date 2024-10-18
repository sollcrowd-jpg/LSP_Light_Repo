package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
    public static void main(String[] args) {
        // Create an instance of VotingMachine
        VotingMachine vm = new VotingMachine();

        // Add candidates
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");

        // Print the vote count for all candidates
        System.out.println(vm.toString()); 
        // Output:
        // Candidate: Alsobrooks, Votes: 1
        // Candidate: Hogan, Votes: 0
    }
}
