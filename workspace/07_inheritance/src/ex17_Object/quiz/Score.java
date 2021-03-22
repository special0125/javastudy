package ex17_Object.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Score {
	
	// field
	private int kor, eng, mat;

	// constructor
	
	// method
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}if(obj instanceof Score) {
			Score s = (Score)obj;
			if(kor == s.kor && eng == s.eng && mat == s.mat) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "[국어: " + kor + ", 영어: " + eng + ", 수학: " + mat + "]"; 
	}
	
	
	
}
