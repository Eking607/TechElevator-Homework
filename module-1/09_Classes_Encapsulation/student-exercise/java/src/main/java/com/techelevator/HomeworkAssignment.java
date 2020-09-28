package com.techelevator;

public class HomeworkAssignment {
	
private int earnedMarks;
private int possibleMarks;
private String submitterName;


	public HomeworkAssignment (int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
	}

	public int getEarnedMarks() {
		return earnedMarks;
	}
	
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}
	
	public String  getLetterGrade() {
		double grade = (double)earnedMarks / possibleMarks;
		if (grade >= 0.9) {
			return "A";
		} 
		else if (grade >= 0.8 && grade < 0.9) {
			return "B";
		}
		else if (grade >= 0.7 && grade < 0.8) {
			return "C";
		}
		else if (grade >= 0.6 && grade < 0.7) {
			return "D";
		}
		else {
			return "F";
		}
	}
}
