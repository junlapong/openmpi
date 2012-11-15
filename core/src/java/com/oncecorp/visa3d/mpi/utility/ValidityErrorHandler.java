/**
 * Copyright 2003, 2004  ONCE Corporation
 *
 * LICENSE:
 * This file is part of BuilditMPI. It may be redistributed and/or modified
 * under the terms of the Common Public License, version 1.0.
 * You should have received a copy of the Common Public License along with this
 * software. See LICENSE.txt for details. Otherwise, you may find it online at:
 *   http://www.oncecorp.com/CPL10/ or http://opensource.org/licenses/cpl.php
 *
 * DISCLAIMER OF WARRANTIES AND LIABILITY:
 * THE SOFTWARE IS PROVIDED "AS IS".  THE AUTHOR MAKES NO REPRESENTATIONS OR
 * WARRANTIES, EITHER EXPRESS OR IMPLIED.  TO THE EXTENT NOT PROHIBITED BY LAW,
 * IN NO EVENT WILL THE AUTHOR BE LIABLE FOR ANY DAMAGES, INCLUDING WITHOUT
 * LIMITATION, LOST REVENUE, PROFITS OR DATA, OR FOR SPECIAL, INDIRECT,
 * CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS
 * OF THE THEORY OF LIABILITY, ARISING OUT OF OR RELATED TO ANY FURNISHING,
 * PRACTICING, MODIFYING OR ANY USE OF THE SOFTWARE, EVEN IF THE AUTHOR HAVE
 * BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * -----------------------------------------------------
 * $Id$
 */

package com.oncecorp.visa3d.mpi.utility;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ErrorHandler;

/**
 * Description: The Error Handler for XMLUtil XML parser
 * 
 * @version 0.1 Aug 19, 2002
 * @author	Alan Zhang
 */
public class ValidityErrorHandler implements ErrorHandler {

	/**
	 * Implements super class abstract method
	 */
	public void warning(SAXParseException ex) throws SAXException {
		System.out.println(ex.getMessage() + "\r\n");
		System.out.println(
			" at line " + ex.getLineNumber() + ", column " + ex.getColumnNumber() + "\r\n");
	}

	/**
	 * Implements super class abstract method
	 */
	public void error(SAXParseException ex) throws SAXException {

		throw new SAXException(ex);
	}

	/**
	 * Implements super class abstract method
	 */
	public void fatalError(SAXParseException ex) throws SAXException {

		throw new SAXException(ex);

	}

}