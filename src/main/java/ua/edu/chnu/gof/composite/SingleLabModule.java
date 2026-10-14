package ua.edu.chnu.gof.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingleLabModule  implements Evaluable{
  private Evaluable child;

  @Override
  public List<Evaluable> getChildren() {
    return List.of(child);
  }
}
