package ua.edu.chnu.gof.composite;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LearningModule implements Evaluable {
	private int num;
	private List<Evaluable> children;


	public int getNum() {
		return this.num;
	}

	public List<Evaluable> getChildren() {
		return this.children;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setChildren(List<Evaluable> children) {
		this.children = children;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof LearningModule)) return false;
		final LearningModule other = (LearningModule) o;
		if (!other.canEqual((Object) this)) return false;
		if (this.getNum() != other.getNum()) return false;
		final Object this$children = this.getChildren();
		final Object other$children = other.getChildren();
		if (this$children == null ? other$children != null : !this$children.equals(other$children))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof LearningModule;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getNum();
		final Object $children = this.getChildren();
		result = result * PRIME + ($children == null ? 43 : $children.hashCode());
		return result;
	}
}
