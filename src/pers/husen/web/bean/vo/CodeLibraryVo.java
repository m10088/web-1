package pers.husen.web.bean.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 何明胜
 *
 * 2017年9月28日
 */
public class CodeLibraryVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int codeId;
	private String codeTitle;
	private String codeAuthor;
	private Date codeDate;
	private int codeRead;
	private String codeSummary;
	private String codeHtmlContent;
	private String codeMdContent;
	private String codeLabel;
	
	@Override
	public String toString() {
		return "CodeLibraryVo [codeId=" + codeId + ", codeTitle=" + codeTitle + ", codeAuthor=" + codeAuthor
				+ ", codeDate=" + codeDate + ", codeRead=" + codeRead + ", codeSummary=" + codeSummary
				+ ", codeHtmlContent=" + codeHtmlContent + ", codeMdContent=" + codeMdContent + ", codeLabel="
				+ codeLabel + "]";
	}
	/**
	 * @return the codeLabel
	 */
	public String getCodeLabel() {
		return codeLabel;
	}
	/**
	 * @param codeLabel the codeLabel to set
	 */
	public void setCodeLabel(String codeLabel) {
		this.codeLabel = codeLabel;
	}
	/**
	 * @return the codeId
	 */
	public int getCodeId() {
		return codeId;
	}
	/**
	 * @param codeId the codeId to set
	 */
	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}
	/**
	 * @return the codeTitle
	 */
	public String getCodeTitle() {
		return codeTitle;
	}
	/**
	 * @param codeTitle the codeTitle to set
	 */
	public void setCodeTitle(String codeTitle) {
		this.codeTitle = codeTitle;
	}
	/**
	 * @return the codeAuthor
	 */
	public String getCodeAuthor() {
		return codeAuthor;
	}
	/**
	 * @param codeAuthor the codeAuthor to set
	 */
	public void setCodeAuthor(String codeAuthor) {
		this.codeAuthor = codeAuthor;
	}
	/**
	 * @return the codeDate
	 */
	public Date getCodeDate() {
		return codeDate;
	}
	/**
	 * @param codeDate the codeDate to set
	 */
	public void setCodeDate(Date codeDate) {
		this.codeDate = codeDate;
	}
	/**
	 * @return the codeRead
	 */
	public int getCodeRead() {
		return codeRead;
	}
	/**
	 * @param codeRead the codeRead to set
	 */
	public void setCodeRead(int codeRead) {
		this.codeRead = codeRead;
	}
	/**
	 * @return the codeSummary
	 */
	public String getCodeSummary() {
		return codeSummary;
	}
	/**
	 * @param codeSummary the codeSummary to set
	 */
	public void setCodeSummary(String codeSummary) {
		this.codeSummary = codeSummary;
	}
	/**
	 * @return the codeHtmlContent
	 */
	public String getCodeHtmlContent() {
		return codeHtmlContent;
	}
	/**
	 * @param codeHtmlContent the codeHtmlContent to set
	 */
	public void setCodeHtmlContent(String codeHtmlContent) {
		this.codeHtmlContent = codeHtmlContent;
	}
	/**
	 * @return the codeMdContent
	 */
	public String getCodeMdContent() {
		return codeMdContent;
	}
	/**
	 * @param codeMdContent the codeMdContent to set
	 */
	public void setCodeMdContent(String codeMdContent) {
		this.codeMdContent = codeMdContent;
	}
}