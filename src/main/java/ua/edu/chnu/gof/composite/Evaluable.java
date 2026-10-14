package ua.edu.chnu.gof.composite;

import java.util.List;

public interface Evaluable {


	default int getSumOfMarksForBranches(){
    int sum = 0;
    for (Evaluable child : getChildren()) {
      sum += child.getSumOfMarksForBranches();
    }
    return sum;

  };

  List<Evaluable> getChildren();
}
