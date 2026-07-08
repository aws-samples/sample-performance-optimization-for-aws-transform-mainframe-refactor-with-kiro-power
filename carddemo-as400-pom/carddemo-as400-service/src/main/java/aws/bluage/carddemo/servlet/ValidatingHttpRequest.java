package aws.bluage.carddemo.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

/**
 * HTTP request validator.
 */
public class ValidatingHttpRequest extends HttpServletRequestWrapper {

	public ValidatingHttpRequest(HttpServletRequest request) {
		super(request);
	}

}
