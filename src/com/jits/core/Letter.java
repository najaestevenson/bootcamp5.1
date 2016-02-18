package com.jits.core;

class Letter extends Parcel {
	LetterType letterType;

	public Letter(long ID, String letterType, Address origin, Address destination) {
		super(ID, destination, origin);
		this.letterType = LetterType.valueOf(letterType.toUpperCase());
	}

	public LetterType getLetterType() {
		return letterType;
	}

	public void setLetterType(LetterType letterType) {
		this.letterType = letterType;
	}

	@Override
	public String toString() {
		return "Letter \nletterType:" + letterType + "\nOrigin" + this.getOrigin() + "\nDestination"
				+ this.getDestination();
	}

}
