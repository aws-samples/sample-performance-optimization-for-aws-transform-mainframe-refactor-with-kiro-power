import com.netfective.bluage.gapwalk.rt.call.MainProgramRunner

applicationContext.getBean("com.netfective.bluage.gapwalk.rt.call.ExecutionController", MainProgramRunner.class)
.runProgram("CDBALC01")

return '[CDBALC01] Balance Calculation Done'
