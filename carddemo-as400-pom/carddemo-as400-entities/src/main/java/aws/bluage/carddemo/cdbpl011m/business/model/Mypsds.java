package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryIntegerType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Mypsds.
 * 
 * <p>About 'proc_name' field, <br>
 * </p>
 * 
 * <p>About 'pgm_status' field, <br>
 * </p>
 * 
 * <p>About 'prv_status' field, <br>
 * </p>
 * 
 * <p>About 'line_num' field, <br>
 * </p>
 * 
 * <p>About 'routine' field, <br>
 * </p>
 * 
 * <p>About 'parms' field, <br>
 * </p>
 * 
 * <p>About 'excp_type' field, <br>
 * </p>
 * 
 * <p>About 'excp_num' field, <br>
 * </p>
 * 
 * <p>About 'machineInstructionNumber' field, <br>
 * </p>
 * 
 * <p>About 'messagesWorkArea' field, <br>
 * </p>
 * 
 * <p>About 'pgm_lib' field, <br>
 * </p>
 * 
 * <p>About 'excp_data' field, <br>
 * </p>
 * 
 * <p>About 'excp_id' field, <br>
 * </p>
 * 
 * <p>About 'fullFileNameWithLastError' field, <br>
 * </p>
 * 
 * <p>About 'psdsUnused1' field, <br>
 * </p>
 * 
 * <p>About 'date1' field, <br>
 * </p>
 * 
 * <p>About 'year' field, <br>
 * </p>
 * 
 * <p>About 'last_file' field, <br>
 * </p>
 * 
 * <p>About 'file_info' field, <br>
 * </p>
 * 
 * <p>About 'job_name' field, <br>
 * </p>
 * 
 * <p>About 'user' field, <br>
 * </p>
 * 
 * <p>About 'job_num' field, <br>
 * </p>
 * 
 * <p>About 'job_date' field, <br>
 * </p>
 * 
 * <p>About 'run_date' field, <br>
 * </p>
 * 
 * <p>About 'run_time' field, <br>
 * </p>
 * 
 * <p>About 'crt_date' field, <br>
 * </p>
 * 
 * <p>About 'crt_time' field, <br>
 * </p>
 * 
 * <p>About 'cpl_level' field, <br>
 * </p>
 * 
 * <p>About 'src_file' field, <br>
 * </p>
 * 
 * <p>About 'src_lib' field, <br>
 * </p>
 * 
 * <p>About 'src_mbr' field, <br>
 * </p>
 * 
 * <p>About 'proc_pgm' field, <br>
 * </p>
 * 
 * <p>About 'proc_mod' field, <br>
 * </p>
 * 
 * <p>About 'src_id_1' field, <br>
 * </p>
 * 
 * <p>About 'src_id_2' field, <br>
 * </p>
 * 
 * <p>About 'cur_user' field, <br>
 * </p>
 * 
 * <p>About 'ext_err' field, <br>
 * </p>
 * 
 * <p>About 'xml_json' field, <br>
 * </p>
 * 
 * <p>About 'int_jobid' field, <br>
 * </p>
 * 
 * <p>About 'sys_name' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Mypsds extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary proc_name = new Elementary(root,new AlphanumericType(10),"Cdbpl011m");
	private final Elementary pgm_status = new Elementary(root,new ZonedType(5, 0, true),Integer.valueOf("42024"));
	private final Elementary prv_status = new Elementary(root,new ZonedType(5, 0, true),Integer.valueOf("41014"));
	private final Elementary line_num = new Elementary(root,new AlphanumericType(8),"00000001");
	private final Elementary routine = new Elementary(root,new AlphanumericType(8),"*ROUTINE");
	private final Elementary parms = new Elementary(root,new ZonedType(3, 0, true));
	private final Elementary excp_type = new Elementary(root,new AlphanumericType(3),"CPF");
	private final Elementary excp_num = new Elementary(root,new AlphanumericType(4),new BigDecimal("1234"));
	private final Elementary machineInstructionNumber = new Elementary(root,new AlphanumericType(4),"MODT");
	private final Elementary messagesWorkArea = new Elementary(root,new AlphanumericType(30),"[---WORK AREA FOR MESSAGES---]");
	private final Elementary pgm_lib = new Elementary(root,new AlphanumericType(10),"[LIB.NAME]");
	private final Elementary excp_data = new Elementary(root,new AlphanumericType(80),"[RETRIEVED EXCEPTION DATA]");
	private final Elementary excp_id = new Elementary(root,new AlphanumericType(4),"9001");
	private final Elementary fullFileNameWithLastError = new Elementary(root,new AlphanumericType(10),"LSTFLINERR");
	private final Elementary psdsUnused1 = new Elementary(root,new AlphanumericType(6));
	private final Elementary date1 = new Elementary(root,new AlphanumericType(8),"[STDATE]");
	private final Elementary year = new Elementary(root,new ZonedType(2, 0, true),"12");
	private final Elementary last_file = new Elementary(root,new AlphanumericType(8),"FILENAME");
	private final Elementary file_info = new Elementary(root,new AlphanumericType(35),"[STATUS INFORMATION LAST USED FILE]");
	private final Elementary job_name = new Elementary(root,new AlphanumericType(10));
	private final Elementary user = new Elementary(root,new AlphanumericType(10));
	private final Elementary job_num = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("123456"));
	private final Elementary job_date = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("180410"));
	private final Elementary run_date = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("180410"));
	private final Elementary run_time = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("182042"));
	private final Elementary crt_date = new Elementary(root,new AlphanumericType(6));
	private final Elementary crt_time = new Elementary(root,new AlphanumericType(6));
	private final Elementary cpl_level = new Elementary(root,new AlphanumericType(4));
	private final Elementary src_file = new Elementary(root,new AlphanumericType(10));
	private final Elementary src_lib = new Elementary(root,new AlphanumericType(10));
	private final Elementary src_mbr = new Elementary(root,new AlphanumericType(10));
	private final Elementary proc_pgm = new Elementary(root,new AlphanumericType(10),"[PROCPROG]");
	private final Elementary proc_mod = new Elementary(root,new AlphanumericType(10));
	private final Elementary src_id_1 = new Elementary(root,new BinaryType(4, 0, "STD", true));
	private final Elementary src_id_2 = new Elementary(root,new BinaryType(4, 0, "STD", true));
	private final Elementary cur_user = new Elementary(root,new AlphanumericType(10));
	private final Elementary ext_err = new Elementary(root,new BinaryIntegerType(4, true));
	private final Elementary xml_json = new Elementary(root,new BinaryIntegerType(8, true));
	private final Elementary int_jobid = new Elementary(root,new AlphanumericType(16));
	private final Elementary sys_name = new Elementary(root,new AlphanumericType(8));
	
	/**
	 * Instantiate a new Mypsds with a default record.
	 * @param configuration the configuration
	 */
	public Mypsds(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Mypsds bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Mypsds(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute proc_name.
	 * @return the proc_name attribute reference
	 */
	public ElementaryRangeReference getProc_nameReference() {
		return proc_name.getReference();
	}

	/**
	 * Getter for proc_name attribute.
	 * @return proc_name attribute
	 */
	public String getProc_name() {
		return proc_name.getValue();
	}

	/**
	 * Setter for proc_name attribute.
	 * @param proc_name the new value of proc_name
	 */
	public void setProc_name(String proc_name) {
		this.proc_name.setValue(proc_name);
	}
	/**
	 * Gets the reference for attribute pgm_status.
	 * @return the pgm_status attribute reference
	 */
	public ElementaryRangeReference getPgm_statusReference() {
		return pgm_status.getReference();
	}

	/**
	 * Getter for pgm_status attribute.
	 * @return pgm_status attribute
	 */
	public int getPgm_status() {
		return pgm_status.getValue();
	}

	/**
	 * Setter for pgm_status attribute.
	 * @param pgm_status the new value of pgm_status
	 */
	public void setPgm_status(int pgm_status) {
		this.pgm_status.setValue(pgm_status);
	}
	/**
	 * Gets the reference for attribute prv_status.
	 * @return the prv_status attribute reference
	 */
	public ElementaryRangeReference getPrv_statusReference() {
		return prv_status.getReference();
	}

	/**
	 * Getter for prv_status attribute.
	 * @return prv_status attribute
	 */
	public int getPrv_status() {
		return prv_status.getValue();
	}

	/**
	 * Setter for prv_status attribute.
	 * @param prv_status the new value of prv_status
	 */
	public void setPrv_status(int prv_status) {
		this.prv_status.setValue(prv_status);
	}
	/**
	 * Gets the reference for attribute line_num.
	 * @return the line_num attribute reference
	 */
	public ElementaryRangeReference getLine_numReference() {
		return line_num.getReference();
	}

	/**
	 * Getter for line_num attribute.
	 * @return line_num attribute
	 */
	public String getLine_num() {
		return line_num.getValue();
	}

	/**
	 * Setter for line_num attribute.
	 * @param line_num the new value of line_num
	 */
	public void setLine_num(String line_num) {
		this.line_num.setValue(line_num);
	}
	/**
	 * Gets the reference for attribute routine.
	 * @return the routine attribute reference
	 */
	public ElementaryRangeReference getRoutineReference() {
		return routine.getReference();
	}

	/**
	 * Getter for routine attribute.
	 * @return routine attribute
	 */
	public String getRoutine() {
		return routine.getValue();
	}

	/**
	 * Setter for routine attribute.
	 * @param routine the new value of routine
	 */
	public void setRoutine(String routine) {
		this.routine.setValue(routine);
	}
	/**
	 * Gets the reference for attribute parms.
	 * @return the parms attribute reference
	 */
	public ElementaryRangeReference getParmsReference() {
		return parms.getReference();
	}

	/**
	 * Getter for parms attribute.
	 * @return parms attribute
	 */
	public int getParms() {
		return parms.getValue();
	}

	/**
	 * Setter for parms attribute.
	 * @param parms the new value of parms
	 */
	public void setParms(int parms) {
		this.parms.setValue(parms);
	}
	/**
	 * Gets the reference for attribute excp_type.
	 * @return the excp_type attribute reference
	 */
	public ElementaryRangeReference getExcp_typeReference() {
		return excp_type.getReference();
	}

	/**
	 * Getter for excp_type attribute.
	 * @return excp_type attribute
	 */
	public String getExcp_type() {
		return excp_type.getValue();
	}

	/**
	 * Setter for excp_type attribute.
	 * @param excp_type the new value of excp_type
	 */
	public void setExcp_type(String excp_type) {
		this.excp_type.setValue(excp_type);
	}
	/**
	 * Gets the reference for attribute excp_num.
	 * @return the excp_num attribute reference
	 */
	public ElementaryRangeReference getExcp_numReference() {
		return excp_num.getReference();
	}

	/**
	 * Getter for excp_num attribute.
	 * @return excp_num attribute
	 */
	public String getExcp_num() {
		return excp_num.getValue();
	}

	/**
	 * Setter for excp_num attribute.
	 * @param excp_num the new value of excp_num
	 */
	public void setExcp_num(String excp_num) {
		this.excp_num.setValue(excp_num);
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
	 * Gets the reference for attribute pgm_lib.
	 * @return the pgm_lib attribute reference
	 */
	public ElementaryRangeReference getPgm_libReference() {
		return pgm_lib.getReference();
	}

	/**
	 * Getter for pgm_lib attribute.
	 * @return pgm_lib attribute
	 */
	public String getPgm_lib() {
		return pgm_lib.getValue();
	}

	/**
	 * Setter for pgm_lib attribute.
	 * @param pgm_lib the new value of pgm_lib
	 */
	public void setPgm_lib(String pgm_lib) {
		this.pgm_lib.setValue(pgm_lib);
	}
	/**
	 * Gets the reference for attribute excp_data.
	 * @return the excp_data attribute reference
	 */
	public ElementaryRangeReference getExcp_dataReference() {
		return excp_data.getReference();
	}

	/**
	 * Getter for excp_data attribute.
	 * @return excp_data attribute
	 */
	public String getExcp_data() {
		return excp_data.getValue();
	}

	/**
	 * Setter for excp_data attribute.
	 * @param excp_data the new value of excp_data
	 */
	public void setExcp_data(String excp_data) {
		this.excp_data.setValue(excp_data);
	}
	/**
	 * Gets the reference for attribute excp_id.
	 * @return the excp_id attribute reference
	 */
	public ElementaryRangeReference getExcp_idReference() {
		return excp_id.getReference();
	}

	/**
	 * Getter for excp_id attribute.
	 * @return excp_id attribute
	 */
	public String getExcp_id() {
		return excp_id.getValue();
	}

	/**
	 * Setter for excp_id attribute.
	 * @param excp_id the new value of excp_id
	 */
	public void setExcp_id(String excp_id) {
		this.excp_id.setValue(excp_id);
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
	 * Gets the reference for attribute date1.
	 * @return the date1 attribute reference
	 */
	public ElementaryRangeReference getDate1Reference() {
		return date1.getReference();
	}

	/**
	 * Getter for date1 attribute.
	 * @return date1 attribute
	 */
	public String getDate1() {
		return date1.getValue();
	}

	/**
	 * Setter for date1 attribute.
	 * @param date1 the new value of date1
	 */
	public void setDate1(String date1) {
		this.date1.setValue(date1);
	}
	/**
	 * Gets the reference for attribute year.
	 * @return the year attribute reference
	 */
	public ElementaryRangeReference getYearReference() {
		return year.getReference();
	}

	/**
	 * Getter for year attribute.
	 * @return year attribute
	 */
	public int getYear() {
		return year.getValue();
	}

	/**
	 * Setter for year attribute.
	 * @param year the new value of year
	 */
	public void setYear(int year) {
		this.year.setValue(year);
	}
	/**
	 * Gets the reference for attribute last_file.
	 * @return the last_file attribute reference
	 */
	public ElementaryRangeReference getLast_fileReference() {
		return last_file.getReference();
	}

	/**
	 * Getter for last_file attribute.
	 * @return last_file attribute
	 */
	public String getLast_file() {
		return last_file.getValue();
	}

	/**
	 * Setter for last_file attribute.
	 * @param last_file the new value of last_file
	 */
	public void setLast_file(String last_file) {
		this.last_file.setValue(last_file);
	}
	/**
	 * Gets the reference for attribute file_info.
	 * @return the file_info attribute reference
	 */
	public ElementaryRangeReference getFile_infoReference() {
		return file_info.getReference();
	}

	/**
	 * Getter for file_info attribute.
	 * @return file_info attribute
	 */
	public String getFile_info() {
		return file_info.getValue();
	}

	/**
	 * Setter for file_info attribute.
	 * @param file_info the new value of file_info
	 */
	public void setFile_info(String file_info) {
		this.file_info.setValue(file_info);
	}
	/**
	 * Gets the reference for attribute job_name.
	 * @return the job_name attribute reference
	 */
	public ElementaryRangeReference getJob_nameReference() {
		return job_name.getReference();
	}

	/**
	 * Getter for job_name attribute.
	 * @return job_name attribute
	 */
	public String getJob_name() {
		return job_name.getValue();
	}

	/**
	 * Setter for job_name attribute.
	 * @param job_name the new value of job_name
	 */
	public void setJob_name(String job_name) {
		this.job_name.setValue(job_name);
	}
	/**
	 * Gets the reference for attribute user.
	 * @return the user attribute reference
	 */
	public ElementaryRangeReference getUserReference() {
		return user.getReference();
	}

	/**
	 * Getter for user attribute.
	 * @return user attribute
	 */
	public String getUser() {
		return user.getValue();
	}

	/**
	 * Setter for user attribute.
	 * @param user the new value of user
	 */
	public void setUser(String user) {
		this.user.setValue(user);
	}
	/**
	 * Gets the reference for attribute job_num.
	 * @return the job_num attribute reference
	 */
	public ElementaryRangeReference getJob_numReference() {
		return job_num.getReference();
	}

	/**
	 * Getter for job_num attribute.
	 * @return job_num attribute
	 */
	public int getJob_num() {
		return job_num.getValue();
	}

	/**
	 * Setter for job_num attribute.
	 * @param job_num the new value of job_num
	 */
	public void setJob_num(int job_num) {
		this.job_num.setValue(job_num);
	}
	/**
	 * Gets the reference for attribute job_date.
	 * @return the job_date attribute reference
	 */
	public ElementaryRangeReference getJob_dateReference() {
		return job_date.getReference();
	}

	/**
	 * Getter for job_date attribute.
	 * @return job_date attribute
	 */
	public int getJob_date() {
		return job_date.getValue();
	}

	/**
	 * Setter for job_date attribute.
	 * @param job_date the new value of job_date
	 */
	public void setJob_date(int job_date) {
		this.job_date.setValue(job_date);
	}
	/**
	 * Gets the reference for attribute run_date.
	 * @return the run_date attribute reference
	 */
	public ElementaryRangeReference getRun_dateReference() {
		return run_date.getReference();
	}

	/**
	 * Getter for run_date attribute.
	 * @return run_date attribute
	 */
	public int getRun_date() {
		return run_date.getValue();
	}

	/**
	 * Setter for run_date attribute.
	 * @param run_date the new value of run_date
	 */
	public void setRun_date(int run_date) {
		this.run_date.setValue(run_date);
	}
	/**
	 * Gets the reference for attribute run_time.
	 * @return the run_time attribute reference
	 */
	public ElementaryRangeReference getRun_timeReference() {
		return run_time.getReference();
	}

	/**
	 * Getter for run_time attribute.
	 * @return run_time attribute
	 */
	public int getRun_time() {
		return run_time.getValue();
	}

	/**
	 * Setter for run_time attribute.
	 * @param run_time the new value of run_time
	 */
	public void setRun_time(int run_time) {
		this.run_time.setValue(run_time);
	}
	/**
	 * Gets the reference for attribute crt_date.
	 * @return the crt_date attribute reference
	 */
	public ElementaryRangeReference getCrt_dateReference() {
		return crt_date.getReference();
	}

	/**
	 * Getter for crt_date attribute.
	 * @return crt_date attribute
	 */
	public String getCrt_date() {
		return crt_date.getValue();
	}

	/**
	 * Setter for crt_date attribute.
	 * @param crt_date the new value of crt_date
	 */
	public void setCrt_date(String crt_date) {
		this.crt_date.setValue(crt_date);
	}
	/**
	 * Gets the reference for attribute crt_time.
	 * @return the crt_time attribute reference
	 */
	public ElementaryRangeReference getCrt_timeReference() {
		return crt_time.getReference();
	}

	/**
	 * Getter for crt_time attribute.
	 * @return crt_time attribute
	 */
	public String getCrt_time() {
		return crt_time.getValue();
	}

	/**
	 * Setter for crt_time attribute.
	 * @param crt_time the new value of crt_time
	 */
	public void setCrt_time(String crt_time) {
		this.crt_time.setValue(crt_time);
	}
	/**
	 * Gets the reference for attribute cpl_level.
	 * @return the cpl_level attribute reference
	 */
	public ElementaryRangeReference getCpl_levelReference() {
		return cpl_level.getReference();
	}

	/**
	 * Getter for cpl_level attribute.
	 * @return cpl_level attribute
	 */
	public String getCpl_level() {
		return cpl_level.getValue();
	}

	/**
	 * Setter for cpl_level attribute.
	 * @param cpl_level the new value of cpl_level
	 */
	public void setCpl_level(String cpl_level) {
		this.cpl_level.setValue(cpl_level);
	}
	/**
	 * Gets the reference for attribute src_file.
	 * @return the src_file attribute reference
	 */
	public ElementaryRangeReference getSrc_fileReference() {
		return src_file.getReference();
	}

	/**
	 * Getter for src_file attribute.
	 * @return src_file attribute
	 */
	public String getSrc_file() {
		return src_file.getValue();
	}

	/**
	 * Setter for src_file attribute.
	 * @param src_file the new value of src_file
	 */
	public void setSrc_file(String src_file) {
		this.src_file.setValue(src_file);
	}
	/**
	 * Gets the reference for attribute src_lib.
	 * @return the src_lib attribute reference
	 */
	public ElementaryRangeReference getSrc_libReference() {
		return src_lib.getReference();
	}

	/**
	 * Getter for src_lib attribute.
	 * @return src_lib attribute
	 */
	public String getSrc_lib() {
		return src_lib.getValue();
	}

	/**
	 * Setter for src_lib attribute.
	 * @param src_lib the new value of src_lib
	 */
	public void setSrc_lib(String src_lib) {
		this.src_lib.setValue(src_lib);
	}
	/**
	 * Gets the reference for attribute src_mbr.
	 * @return the src_mbr attribute reference
	 */
	public ElementaryRangeReference getSrc_mbrReference() {
		return src_mbr.getReference();
	}

	/**
	 * Getter for src_mbr attribute.
	 * @return src_mbr attribute
	 */
	public String getSrc_mbr() {
		return src_mbr.getValue();
	}

	/**
	 * Setter for src_mbr attribute.
	 * @param src_mbr the new value of src_mbr
	 */
	public void setSrc_mbr(String src_mbr) {
		this.src_mbr.setValue(src_mbr);
	}
	/**
	 * Gets the reference for attribute proc_pgm.
	 * @return the proc_pgm attribute reference
	 */
	public ElementaryRangeReference getProc_pgmReference() {
		return proc_pgm.getReference();
	}

	/**
	 * Getter for proc_pgm attribute.
	 * @return proc_pgm attribute
	 */
	public String getProc_pgm() {
		return proc_pgm.getValue();
	}

	/**
	 * Setter for proc_pgm attribute.
	 * @param proc_pgm the new value of proc_pgm
	 */
	public void setProc_pgm(String proc_pgm) {
		this.proc_pgm.setValue(proc_pgm);
	}
	/**
	 * Gets the reference for attribute proc_mod.
	 * @return the proc_mod attribute reference
	 */
	public ElementaryRangeReference getProc_modReference() {
		return proc_mod.getReference();
	}

	/**
	 * Getter for proc_mod attribute.
	 * @return proc_mod attribute
	 */
	public String getProc_mod() {
		return proc_mod.getValue();
	}

	/**
	 * Setter for proc_mod attribute.
	 * @param proc_mod the new value of proc_mod
	 */
	public void setProc_mod(String proc_mod) {
		this.proc_mod.setValue(proc_mod);
	}
	/**
	 * Gets the reference for attribute src_id_1.
	 * @return the src_id_1 attribute reference
	 */
	public ElementaryRangeReference getSrc_id_1Reference() {
		return src_id_1.getReference();
	}

	/**
	 * Getter for src_id_1 attribute.
	 * @return src_id_1 attribute
	 */
	public int getSrc_id_1() {
		return src_id_1.getValue();
	}

	/**
	 * Setter for src_id_1 attribute.
	 * @param src_id_1 the new value of src_id_1
	 */
	public void setSrc_id_1(int src_id_1) {
		this.src_id_1.setValue(src_id_1);
	}
	/**
	 * Gets the reference for attribute src_id_2.
	 * @return the src_id_2 attribute reference
	 */
	public ElementaryRangeReference getSrc_id_2Reference() {
		return src_id_2.getReference();
	}

	/**
	 * Getter for src_id_2 attribute.
	 * @return src_id_2 attribute
	 */
	public int getSrc_id_2() {
		return src_id_2.getValue();
	}

	/**
	 * Setter for src_id_2 attribute.
	 * @param src_id_2 the new value of src_id_2
	 */
	public void setSrc_id_2(int src_id_2) {
		this.src_id_2.setValue(src_id_2);
	}
	/**
	 * Gets the reference for attribute cur_user.
	 * @return the cur_user attribute reference
	 */
	public ElementaryRangeReference getCur_userReference() {
		return cur_user.getReference();
	}

	/**
	 * Getter for cur_user attribute.
	 * @return cur_user attribute
	 */
	public String getCur_user() {
		return cur_user.getValue();
	}

	/**
	 * Setter for cur_user attribute.
	 * @param cur_user the new value of cur_user
	 */
	public void setCur_user(String cur_user) {
		this.cur_user.setValue(cur_user);
	}
	/**
	 * Gets the reference for attribute ext_err.
	 * @return the ext_err attribute reference
	 */
	public ElementaryRangeReference getExt_errReference() {
		return ext_err.getReference();
	}

	/**
	 * Getter for ext_err attribute.
	 * @return ext_err attribute
	 */
	public int getExt_err() {
		return ext_err.getValue();
	}

	/**
	 * Setter for ext_err attribute.
	 * @param ext_err the new value of ext_err
	 */
	public void setExt_err(int ext_err) {
		this.ext_err.setValue(ext_err);
	}
	/**
	 * Gets the reference for attribute xml_json.
	 * @return the xml_json attribute reference
	 */
	public ElementaryRangeReference getXml_jsonReference() {
		return xml_json.getReference();
	}

	/**
	 * Getter for xml_json attribute.
	 * @return xml_json attribute
	 */
	public long getXml_json() {
		return xml_json.getValue();
	}

	/**
	 * Setter for xml_json attribute.
	 * @param xml_json the new value of xml_json
	 */
	public void setXml_json(long xml_json) {
		this.xml_json.setValue(xml_json);
	}
	/**
	 * Gets the reference for attribute int_jobid.
	 * @return the int_jobid attribute reference
	 */
	public ElementaryRangeReference getInt_jobidReference() {
		return int_jobid.getReference();
	}

	/**
	 * Getter for int_jobid attribute.
	 * @return int_jobid attribute
	 */
	public String getInt_jobid() {
		return int_jobid.getValue();
	}

	/**
	 * Setter for int_jobid attribute.
	 * @param int_jobid the new value of int_jobid
	 */
	public void setInt_jobid(String int_jobid) {
		this.int_jobid.setValue(int_jobid);
	}
	/**
	 * Gets the reference for attribute sys_name.
	 * @return the sys_name attribute reference
	 */
	public ElementaryRangeReference getSys_nameReference() {
		return sys_name.getReference();
	}

	/**
	 * Getter for sys_name attribute.
	 * @return sys_name attribute
	 */
	public String getSys_name() {
		return sys_name.getValue();
	}

	/**
	 * Setter for sys_name attribute.
	 * @param sys_name the new value of sys_name
	 */
	public void setSys_name(String sys_name) {
		this.sys_name.setValue(sys_name);
	}
}
