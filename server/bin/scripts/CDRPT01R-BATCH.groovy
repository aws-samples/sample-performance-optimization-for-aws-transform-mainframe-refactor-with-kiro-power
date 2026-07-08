import com.netfective.bluage.gapwalk.rt.call.MainProgramRunner

applicationContext.getBean("com.netfective.bluage.gapwalk.rt.call.ExecutionController", MainProgramRunner.class)
.runProgram("CDRPT01R")

return '[CDRPT01R] Done'
