package com.nishtahir.Collections;

public class Box implements Comparable<Box>{
	
	String label;
	int content;
	
	
	public Box(String label, int content) {
		super();
		this.label = label;
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + content;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (content != other.content)
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}

	@Override
	public int compareTo(Box o) {
		return label.compareTo(o.label);
	}

	@Override
	public String toString() {
		return "Box [label=" + label + ", content=" + content + "]";
	}

	
}
