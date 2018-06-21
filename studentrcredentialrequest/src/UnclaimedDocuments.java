class UnclaimedDocuments
{
	private String studId;
	private String reqDoc;
	private String dateReq;
	private String remarks;

	public void setStudId(String si) {
		studId = si;
	}

	public String getStudId() {
		return(studId);
	}

	public void setReqDoc(String rd) {
		reqDoc = rd;
	}

	public String getReqDoc() {
		return(reqDoc);
	}

	public void setDateReq(String dr) {
		dateReq = dr;
	}

	public String getDateReq() {
		return(dateReq);
	}

	public void setRemarks(String r) {
		remarks = r;
	}

	public String getRemarks() {
		return(remarks);
	}
}
