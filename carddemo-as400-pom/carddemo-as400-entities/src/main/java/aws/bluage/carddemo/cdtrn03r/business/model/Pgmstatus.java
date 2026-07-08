package aws.bluage.carddemo.cdtrn03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Pgmstatus.
 * 
 * <p>About 'pgmname' field, <br>
 * </p>
 * 
 * <p>About 'programStatus' field, <br>
 * </p>
 * 
 * <p>About 'previousProgramStatus' field, <br>
 * </p>
 * 
 * <p>About 'sourceStatementSequenceNumber' field, <br>
 * </p>
 * 
 * <p>About 'routineInError' field, <br>
 * </p>
 * 
 * <p>About 'argumentsCount' field, <br>
 * </p>
 * 
 * <p>About 'exceptionType' field, <br>
 * </p>
 * 
 * <p>About 'exceptionNumber' field, <br>
 * </p>
 * 
 * <p>About 'machineInstructionNumber' field, <br>
 * </p>
 * 
 * <p>About 'messagesWorkArea' field, <br>
 * </p>
 * 
 * <p>About 'programLibraryName' field, <br>
 * </p>
 * 
 * <p>About 'retrievedExceptionData' field, <br>
 * </p>
 * 
 * <p>About 'exceptionIdentification' field, <br>
 * </p>
 * 
 * <p>About 'fullFileNameWithLastError' field, <br>
 * </p>
 * 
 * <p>About 'psdsUnused1' field, <br>
 * </p>
 * 
 * <p>About 'jobStartDate' field, <br>
 * </p>
 * 
 * <p>About 'yearFirstDigits' field, <br>
 * </p>
 * 
 * <p>About 'lastFileInErrorName' field, <br>
 * </p>
 * 
 * <p>About 'lastFileInErrorStatusInformation' field, <br>
 * </p>
 * 
 * <p>About 'jobName' field, <br>
 * </p>
 * 
 * <p>About 'userid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pgmstatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pgmname = new Elementary(root,new AlphanumericType(10),"Cdtrn03r");
	private final Elementary programStatus = new Elementary(root,new ZonedType(5, 0, true),Integer.valueOf("42024"));
	private final Elementary previousProgramStatus = new Elementary(root,new ZonedType(5, 0, true),Integer.valueOf("41014"));
	private final Elementary sourceStatementSequenceNumber = new Elementary(root,new AlphanumericType(8),"00000001");
	private final Elementary routineInError = new Elementary(root,new AlphanumericType(8),"*ROUTINE");
	private final Elementary argumentsCount = new Elementary(root,new ZonedType(3, 0, true));
	private final Elementary exceptionType = new Elementary(root,new AlphanumericType(3),"CPF");
	private final Elementary exceptionNumber = new Elementary(root,new AlphanumericType(4),new BigDecimal("1234"));
	private final Elementary machineInstructionNumber = new Elementary(root,new AlphanumericType(4),"MODT");
	private final Elementary messagesWorkArea = new Elementary(root,new AlphanumericType(30),"[---WORK AREA FOR MESSAGES---]");
	private final Elementary programLibraryName = new Elementary(root,new AlphanumericType(10),"[LIB.NAME]");
	private final Elementary retrievedExceptionData = new Elementary(root,new AlphanumericType(80),"[RETRIEVED EXCEPTION DATA]");
	private final Elementary exceptionIdentification = new Elementary(root,new AlphanumericType(4),"9001");
	private final Elementary fullFileNameWithLastError = new Elementary(root,new AlphanumericType(10),"LSTFLINERR");
	private final Elementary psdsUnused1 = new Elementary(root,new AlphanumericType(6));
	private final Elementary jobStartDate = new Elementary(root,new AlphanumericType(8),"[STDATE]");
	private final Elementary yearFirstDigits = new Elementary(root,new ZonedType(2, 0, true),"12");
	private final Elementary lastFileInErrorName = new Elementary(root,new AlphanumericType(8),"FILENAME");
	private final Elementary lastFileInErrorStatusInformation = new Elementary(root,new AlphanumericType(35),"[STATUS INFORMATION LAST USED FILE]");
	private final Elementary jobName = new Elementary(root,new AlphanumericType(10));
	private final Elementary userid = new Elementary(root,new AlphanumericType(10));
	
	/**
	 * Instantiate a new Pgmstatus with a default record.
	 * @param configuration the configuration
	 */
	public Pgmstatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pgmstatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pgmstatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pgmname.
	 * @return the pgmname attribute reference
	 */
	public ElementaryRangeReference getPgmnameReference() {
		return pgmname.getReference();
	}

	/**
	 * Getter for pgmname attribute.
	 * @return pgmname attribute
	 */
	public String getPgmname() {
		return pgmname.getValue();
	}

	/**
	 * Setter for pgmname attribute.
	 * @param pgmname the new value of pgmname
	 */
	public void setPgmname(String pgmname) {
		this.pgmname.setValue(pgmname);
	}
	/**
	 * Gets the reference for attribute programStatus.
	 * @return the programStatus attribute reference
	 */
	public ElementaryRangeReference getProgramStatusReference() {
		return programStatus.getReference();
	}

	/**
	 * Getter for programStatus attribute.
	 * @return programStatus attribute
	 */
	public int getProgramStatus() {
		return programStatus.getValue();
	}

	/**
	 * Setter for programStatus attribute.
	 * @param programStatus the new value of programStatus
	 */
	public void setProgramStatus(int programStatus) {
		this.programStatus.setValue(programStatus);
	}
	/**
	 * Gets the reference for attribute previousProgramStatus.
	 * @return the previousProgramStatus attribute reference
	 */
	public ElementaryRangeReference getPreviousProgramStatusReference() {
		return previousProgramStatus.getReference();
	}

	/**
	 * Getter for previousProgramStatus attribute.
	 * @return previousProgramStatus attribute
	 */
	public int getPreviousProgramStatus() {
		return previousProgramStatus.getValue();
	}

	/**
	 * Setter for previousProgramStatus attribute.
	 * @param previousProgramStatus the new value of previousProgramStatus
	 */
	public void setPreviousProgramStatus(int previousProgramStatus) {
		this.previousProgramStatus.setValue(previousProgramStatus);
	}
	/**
	 * Gets the reference for attribute sourceStatementSequenceNumber.
	 * @return the sourceStatementSequenceNumber attribute reference
	 */
	public ElementaryRangeReference getSourceStatementSequenceNumberReference() {
		return sourceStatementSequenceNumber.getReference();
	}

	/**
	 * Getter for sourceStatementSequenceNumber attribute.
	 * @return sourceStatementSequenceNumber attribute
	 */
	public String getSourceStatementSequenceNumber() {
		return sourceStatementSequenceNumber.getValue();
	}

	/**
	 * Setter for sourceStatementSequenceNumber attribute.
	 * @param sourceStatementSequenceNumber the new value of sourceStatementSequenceNumber
	 */
	public void setSourceStatementSequenceNumber(String sourceStatementSequenceNumber) {
		this.sourceStatementSequenceNumber.setValue(sourceStatementSequenceNumber);
	}
	/**
	 * Gets the reference for attribute routineInError.
	 * @return the routineInError attribute reference
	 */
	public ElementaryRangeReference getRoutineInErrorReference() {
		return routineInError.getReference();
	}

	/**
	 * Getter for routineInError attribute.
	 * @return routineInError attribute
	 */
	public String getRoutineInError() {
		return routineInError.getValue();
	}

	/**
	 * Setter for routineInError attribute.
	 * @param routineInError the new value of routineInError
	 */
	public void setRoutineInError(String routineInError) {
		this.routineInError.setValue(routineInError);
	}
	/**
	 * Gets the reference for attribute argumentsCount.
	 * @return the argumentsCount attribute reference
	 */
	public ElementaryRangeReference getArgumentsCountReference() {
		return argumentsCount.getReference();
	}

	/**
	 * Getter for argumentsCount attribute.
	 * @return argumentsCount attribute
	 */
	public int getArgumentsCount() {
		return argumentsCount.getValue();
	}

	/**
	 * Setter for argumentsCount attribute.
	 * @param argumentsCount the new value of argumentsCount
	 */
	public void setArgumentsCount(int argumentsCount) {
		this.argumentsCount.setValue(argumentsCount);
	}
	/**
	 * Gets the reference for attribute exceptionType.
	 * @return the exceptionType attribute reference
	 */
	public ElementaryRangeReference getExceptionTypeReference() {
		return exceptionType.getReference();
	}

	/**
	 * Getter for exceptionType attribute.
	 * @return exceptionType attribute
	 */
	public String getExceptionType() {
		return exceptionType.getValue();
	}

	/**
	 * Setter for exceptionType attribute.
	 * @param exceptionType the new value of exceptionType
	 */
	public void setExceptionType(String exceptionType) {
		this.exceptionType.setValue(exceptionType);
	}
	/**
	 * Gets the reference for attribute exceptionNumber.
	 * @return the exceptionNumber attribute reference
	 */
	public ElementaryRangeReference getExceptionNumberReference() {
		return exceptionNumber.getReference();
	}

	/**
	 * Getter for exceptionNumber attribute.
	 * @return exceptionNumber attribute
	 */
	public String getExceptionNumber() {
		return exceptionNumber.getValue();
	}

	/**
	 * Setter for exceptionNumber attribute.
	 * @param exceptionNumber the new value of exceptionNumber
	 */
	public void setExceptionNumber(String exceptionNumber) {
		this.exceptionNumber.setValue(exceptionNumber);
	}
	/**
	 * Gets the reference for attribute machineInstructionNumber.
	 * @return the machineInstructionNumber attribute reference
	 */
	public ElementaryRangeReference getMachineInstructionNumberReference() {
		return machineInstructionNumber.getReference();
	}

	/**
	 * Getter for machineInstructionNumber attribute.
	 * @return machineInstructionNumber attribute
	 */
	public String getMachineInstructionNumber() {
		return machineInstructionNumber.getValue();
	}

	/**
	 * Setter for machineInstructionNumber attribute.
	 * @param machineInstructionNumber the new value of machineInstructionNumber
	 */
	public void setMachineInstructionNumber(String machineInstructionNumber) {
		this.machineInstructionNumber.setValue(machineInstructionNumber);
	}
	/**
	 * Gets the reference for attribute messagesWorkArea.
	 * @return the messagesWorkArea attribute reference
	 */
	public ElementaryRangeReference getMessagesWorkAreaReference() {
		return messagesWorkArea.getReference();
	}

	/**
	 * Getter for messagesWorkArea attribute.
	 * @return messagesWorkArea attribute
	 */
	public String getMessagesWorkArea() {
		return messagesWorkArea.getValue();
	}

	/**
	 * Setter for messagesWorkArea attribute.
	 * @param messagesWorkArea the new value of messagesWorkArea
	 */
	public void setMessagesWorkArea(String messagesWorkArea) {
		this.messagesWorkArea.setValue(messagesWorkArea);
	}
	/**
	 * Gets the reference for attribute programLibraryName.
	 * @return the programLibraryName attribute reference
	 */
	public ElementaryRangeReference getProgramLibraryNameReference() {
		return programLibraryName.getReference();
	}

	/**
	 * Getter for programLibraryName attribute.
	 * @return programLibraryName attribute
	 */
	public String getProgramLibraryName() {
		return programLibraryName.getValue();
	}

	/**
	 * Setter for programLibraryName attribute.
	 * @param programLibraryName the new value of programLibraryName
	 */
	public void setProgramLibraryName(String programLibraryName) {
		this.programLibraryName.setValue(programLibraryName);
	}
	/**
	 * Gets the reference for attribute retrievedExceptionData.
	 * @return the retrievedExceptionData attribute reference
	 */
	public ElementaryRangeReference getRetrievedExceptionDataReference() {
		return retrievedExceptionData.getReference();
	}

	/**
	 * Getter for retrievedExceptionData attribute.
	 * @return retrievedExceptionData attribute
	 */
	public String getRetrievedExceptionData() {
		return retrievedExceptionData.getValue();
	}

	/**
	 * Setter for retrievedExceptionData attribute.
	 * @param retrievedExceptionData the new value of retrievedExceptionData
	 */
	public void setRetrievedExceptionData(String retrievedExceptionData) {
		this.retrievedExceptionData.setValue(retrievedExceptionData);
	}
	/**
	 * Gets the reference for attribute exceptionIdentification.
	 * @return the exceptionIdentification attribute reference
	 */
	public ElementaryRangeReference getExceptionIdentificationReference() {
		return exceptionIdentification.getReference();
	}

	/**
	 * Getter for exceptionIdentification attribute.
	 * @return exceptionIdentification attribute
	 */
	public String getExceptionIdentification() {
		return exceptionIdentification.getValue();
	}

	/**
	 * Setter for exceptionIdentification attribute.
	 * @param exceptionIdentification the new value of exceptionIdentification
	 */
	public void setExceptionIdentification(String exceptionIdentification) {
		this.exceptionIdentification.setValue(exceptionIdentification);
	}
	/**
	 * Gets the reference for attribute fullFileNameWithLastError.
	 * @return the fullFileNameWithLastError attribute reference
	 */
	public ElementaryRangeReference getFullFileNameWithLastErrorReference() {
		return fullFileNameWithLastError.getReference();
	}

	/**
	 * Getter for fullFileNameWithLastError attribute.
	 * @return fullFileNameWithLastError attribute
	 */
	public String getFullFileNameWithLastError() {
		return fullFileNameWithLastError.getValue();
	}

	/**
	 * Setter for fullFileNameWithLastError attribute.
	 * @param fullFileNameWithLastError the new value of fullFileNameWithLastError
	 */
	public void setFullFileNameWithLastError(String fullFileNameWithLastError) {
		this.fullFileNameWithLastError.setValue(fullFileNameWithLastError);
	}
	/**
	 * Gets the reference for attribute psdsUnused1.
	 * @return the psdsUnused1 attribute reference
	 */
	public ElementaryRangeReference getPsdsUnused1Reference() {
		return psdsUnused1.getReference();
	}

	/**
	 * Getter for psdsUnused1 attribute.
	 * @return psdsUnused1 attribute
	 */
	public String getPsdsUnused1() {
		return psdsUnused1.getValue();
	}

	/**
	 * Setter for psdsUnused1 attribute.
	 * @param psdsUnused1 the new value of psdsUnused1
	 */
	public void setPsdsUnused1(String psdsUnused1) {
		this.psdsUnused1.setValue(psdsUnused1);
	}
	/**
	 * Gets the reference for attribute jobStartDate.
	 * @return the jobStartDate attribute reference
	 */
	public ElementaryRangeReference getJobStartDateReference() {
		return jobStartDate.getReference();
	}

	/**
	 * Getter for jobStartDate attribute.
	 * @return jobStartDate attribute
	 */
	public String getJobStartDate() {
		return jobStartDate.getValue();
	}

	/**
	 * Setter for jobStartDate attribute.
	 * @param jobStartDate the new value of jobStartDate
	 */
	public void setJobStartDate(String jobStartDate) {
		this.jobStartDate.setValue(jobStartDate);
	}
	/**
	 * Gets the reference for attribute yearFirstDigits.
	 * @return the yearFirstDigits attribute reference
	 */
	public ElementaryRangeReference getYearFirstDigitsReference() {
		return yearFirstDigits.getReference();
	}

	/**
	 * Getter for yearFirstDigits attribute.
	 * @return yearFirstDigits attribute
	 */
	public int getYearFirstDigits() {
		return yearFirstDigits.getValue();
	}

	/**
	 * Setter for yearFirstDigits attribute.
	 * @param yearFirstDigits the new value of yearFirstDigits
	 */
	public void setYearFirstDigits(int yearFirstDigits) {
		this.yearFirstDigits.setValue(yearFirstDigits);
	}
	/**
	 * Gets the reference for attribute lastFileInErrorName.
	 * @return the lastFileInErrorName attribute reference
	 */
	public ElementaryRangeReference getLastFileInErrorNameReference() {
		return lastFileInErrorName.getReference();
	}

	/**
	 * Getter for lastFileInErrorName attribute.
	 * @return lastFileInErrorName attribute
	 */
	public String getLastFileInErrorName() {
		return lastFileInErrorName.getValue();
	}

	/**
	 * Setter for lastFileInErrorName attribute.
	 * @param lastFileInErrorName the new value of lastFileInErrorName
	 */
	public void setLastFileInErrorName(String lastFileInErrorName) {
		this.lastFileInErrorName.setValue(lastFileInErrorName);
	}
	/**
	 * Gets the reference for attribute lastFileInErrorStatusInformation.
	 * @return the lastFileInErrorStatusInformation attribute reference
	 */
	public ElementaryRangeReference getLastFileInErrorStatusInformationReference() {
		return lastFileInErrorStatusInformation.getReference();
	}

	/**
	 * Getter for lastFileInErrorStatusInformation attribute.
	 * @return lastFileInErrorStatusInformation attribute
	 */
	public String getLastFileInErrorStatusInformation() {
		return lastFileInErrorStatusInformation.getValue();
	}

	/**
	 * Setter for lastFileInErrorStatusInformation attribute.
	 * @param lastFileInErrorStatusInformation the new value of lastFileInErrorStatusInformation
	 */
	public void setLastFileInErrorStatusInformation(String lastFileInErrorStatusInformation) {
		this.lastFileInErrorStatusInformation.setValue(lastFileInErrorStatusInformation);
	}
	/**
	 * Gets the reference for attribute jobName.
	 * @return the jobName attribute reference
	 */
	public ElementaryRangeReference getJobNameReference() {
		return jobName.getReference();
	}

	/**
	 * Getter for jobName attribute.
	 * @return jobName attribute
	 */
	public String getJobName() {
		return jobName.getValue();
	}

	/**
	 * Setter for jobName attribute.
	 * @param jobName the new value of jobName
	 */
	public void setJobName(String jobName) {
		this.jobName.setValue(jobName);
	}
	/**
	 * Gets the reference for attribute userid.
	 * @return the userid attribute reference
	 */
	public ElementaryRangeReference getUseridReference() {
		return userid.getReference();
	}

	/**
	 * Getter for userid attribute.
	 * @return userid attribute
	 */
	public String getUserid() {
		return userid.getValue();
	}

	/**
	 * Setter for userid attribute.
	 * @param userid the new value of userid
	 */
	public void setUserid(String userid) {
		this.userid.setValue(userid);
	}
}
