package ua.edu.chnu.gof.chainOfResponsibities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Document {
	private String text;
	private String code;
}
