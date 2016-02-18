package com.jits.core;

interface IConfirmation {
	abstract public String getStatus();
	abstract  public Address getOrigin();
	abstract public Address getDest();
    abstract public String getPackageType();
	abstract public String getDeliveryType();
    abstract public double getWeight();
	abstract  public boolean isInsured();
	abstract  public double getDeliveryTime();
	abstract  public double getCost();
	  
	  /**
	   * Returns a string comprising all the data.
	   * NOTE: will look nicer in UI if individual items are separated with newlines, e.g.:
	   * Status: Pending
	   * Origin: Joe Smith
	   *   215 State St.
	   *   ...
	   * Destination: Jane Doe
	   *   211 Main St.
	   *   ...
	   * Package type: Box
	   * Cost: 5.78
	   * ...
	   */
	  public String toString();
	}

