import com.netfective.bluage.gapwalk.rt.call.MainProgramRunner
import com.netfective.bluage.gapwalk.rt.shared.SharedContext

// Action to trigger: start or stop
def actionValue = binding.hasVariable('action') && action == 'start' ? 'start' : 'stop'

// Transaction status for authorization check => either 's' (submitted) or 'a' (submitted review)
def transactionStatusValue = binding.hasVariable('transactionStatus') ? transactionStatus : 's'

new Thread ({ -> 

	def parameters = new HashMap<String, Object>()
	parameters.put("action", actionValue)
	
	applicationContext.getBean("com.netfective.bluage.gapwalk.rt.call.ExecutionController", MainProgramRunner.class)
	.withArguments(transactionStatusValue)
	.withParameters(parameters)
	.runProgram("CDBPL011M")

}).start()

return '[CDBPL011M] Action: ' + actionValue + ' | Transaction status: ' + transactionStatusValue + ' | Done'
