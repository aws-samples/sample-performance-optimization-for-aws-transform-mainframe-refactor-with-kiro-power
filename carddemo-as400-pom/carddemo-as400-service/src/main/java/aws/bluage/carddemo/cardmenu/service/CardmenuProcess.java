package aws.bluage.carddemo.cardmenu.service;

import aws.bluage.carddemo.cardmenu.business.context.CardmenuContext;
import aws.bluage.carddemo.common.business.screen.support.CdmenudCardmenu;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface CardmenuProcess.
 * 
 * Defines application services for CardmenuProcess
 */
public interface CardmenuProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final CardmenuContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final CardmenuContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation fromCDMENUD_CARDMENU.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDMENUD_CARDMENU(final CardmenuContext ctx, final ExecutionController ctrl, final CdmenudCardmenu vo);

	/**
	 * Process operation toCDMENUD_CARDMENU.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDMENUD_CARDMENU(final CardmenuContext ctx, final ExecutionController ctrl, final CdmenudCardmenu vo);

}
