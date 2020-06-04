
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class WorkLog {

	
	private Long worklogId;
	
	
	private IssueModel issue;
	

	private Float time;
	
	
	private String date;

	public WorkLog() {
		super();
	}

	public WorkLog(IssueModel issue, Float time, String date) {
		super();
		this.issue = issue;
		this.time = time;
		this.date = date;
	}

	public Long getWorklogId() {
		return worklogId;
	}

	public void setWorklogId(Long worklogId) {
		this.worklogId = worklogId;
	}

	public IssueModel getIssue() {
		return issue;
	}

	public void setIssue(IssueModel issue) {
		this.issue = issue;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
