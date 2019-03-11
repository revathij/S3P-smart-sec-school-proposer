package com.testspace.test_smart_sec_school_proposer;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Student implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Postal Code")
	private int postalCode;
	@org.kie.api.definition.type.Label("Mode of transport")
	private java.lang.String modeOfTransport;
	@org.kie.api.definition.type.Label("Expected or Prelims Score")
	private int expectedScore;
	@org.kie.api.definition.type.Label("Mother Tongue ")
	private java.lang.String motherTongue;
	@org.kie.api.definition.type.Label("Resident Status")
	private java.lang.String residentStatus;
	@org.kie.api.definition.type.Label("Gender")
	private java.lang.String gender;
	@org.kie.api.definition.type.Label("Preference of co-ed/single")
	private java.lang.String preferenceCoedOrSingle;

	@org.kie.api.definition.type.Label("Error and Cause")
	private com.testspace.test_smart_sec_school_proposer.ValidationErrorDO error;

	@org.kie.api.definition.type.Label("Dummy Variable")
	private Boolean firstEntrytoLoad = true;

	@org.kie.api.definition.type.Label(value = "School Collection")
	private com.testspace.test_smart_sec_school_proposer.SchoolCollection schoolCollection;

	public Student() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public java.lang.String getModeOfTransport() {
		return this.modeOfTransport;
	}

	public void setModeOfTransport(java.lang.String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public int getExpectedScore() {
		return this.expectedScore;
	}

	public void setExpectedScore(int expectedScore) {
		this.expectedScore = expectedScore;
	}

	public java.lang.String getMotherTongue() {
		return this.motherTongue;
	}

	public void setMotherTongue(java.lang.String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public java.lang.String getResidentStatus() {
		return this.residentStatus;
	}

	public void setResidentStatus(java.lang.String residentStatus) {
		this.residentStatus = residentStatus;
	}

	public java.lang.String getGender() {
		return this.gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public java.lang.String getPreferenceCoedOrSingle() {
		return this.preferenceCoedOrSingle;
	}

	public void setPreferenceCoedOrSingle(
			java.lang.String preferenceCoedOrSingle) {
		this.preferenceCoedOrSingle = preferenceCoedOrSingle;
	}

	public com.testspace.test_smart_sec_school_proposer.ValidationErrorDO getError() {
		return this.error;
	}

	public void setError(
			com.testspace.test_smart_sec_school_proposer.ValidationErrorDO error) {
		this.error = error;
	}

	public java.lang.Boolean getFirstEntrytoLoad() {
		return this.firstEntrytoLoad;
	}

	public void setFirstEntrytoLoad(java.lang.Boolean firstEntrytoLoad) {
		this.firstEntrytoLoad = firstEntrytoLoad;
	}

	public com.testspace.test_smart_sec_school_proposer.SchoolCollection getSchoolCollection() {
		return this.schoolCollection;
	}

	public void setSchoolCollection(
			com.testspace.test_smart_sec_school_proposer.SchoolCollection schoolCollection) {
		this.schoolCollection = schoolCollection;
	}

	public Student(
			java.lang.String name,
			int postalCode,
			java.lang.String modeOfTransport,
			int expectedScore,
			java.lang.String motherTongue,
			java.lang.String residentStatus,
			java.lang.String gender,
			java.lang.String preferenceCoedOrSingle,
			com.testspace.test_smart_sec_school_proposer.ValidationErrorDO error,
			java.lang.Boolean firstEntrytoLoad,
			com.testspace.test_smart_sec_school_proposer.SchoolCollection schoolCollection) {
		this.name = name;
		this.postalCode = postalCode;
		this.modeOfTransport = modeOfTransport;
		this.expectedScore = expectedScore;
		this.motherTongue = motherTongue;
		this.residentStatus = residentStatus;
		this.gender = gender;
		this.preferenceCoedOrSingle = preferenceCoedOrSingle;
		this.error = error;
		this.firstEntrytoLoad = firstEntrytoLoad;
		this.schoolCollection = schoolCollection;
		//populateSchoolCollection();
		
	}
	
	public void populateSchoolCollection(){
	    System.out.println("populateSchools"+schoolCollection);
	    schoolCollection = new SchoolCollection();
	    System.out.println("afer populateSchools"+schoolCollection);
	    
	    schoolCollection.populateSchools();
	     System.out.println("afer populateSchools"+schoolCollection.getSchoolList());
	}

}