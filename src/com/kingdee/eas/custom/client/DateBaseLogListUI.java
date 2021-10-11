/**
 * output package name
 */
package com.kingdee.eas.custom.client;

import java.awt.event.*;
import org.apache.log4j.Logger;
import com.kingdee.bos.ui.face.CoreUIObject;
import com.kingdee.bos.dao.IObjectValue;
import com.kingdee.eas.fi.gl.app.GLWebServiceFacadeControllerBean;
import com.kingdee.eas.fi.gl.app.WSVoucherControllerBean;
import com.kingdee.eas.framework.*;

/**
 * output class name
 */
public class DateBaseLogListUI extends AbstractDateBaseLogListUI
{
    private static final Logger logger = CoreUIObject.getLogger(DateBaseLogListUI.class);
    
    /**
     * output class constructor
     */
    public DateBaseLogListUI() throws Exception
    {
        super();
    }

    /**
     * output storeFields method
     */
    public void storeFields()
    {
        super.storeFields();
    }

    /**
     * output getBizInterface method
     */
    protected com.kingdee.eas.framework.ICoreBase getBizInterface() throws Exception
    {
        return com.kingdee.eas.custom.DateBaseLogFactory.getRemoteInstance();
    }

    /**
     * output createNewData method
     */
    protected com.kingdee.bos.dao.IObjectValue createNewData()
    {
        com.kingdee.eas.custom.DateBaseLogInfo objectValue = new com.kingdee.eas.custom.DateBaseLogInfo();
		
        return objectValue;
    }

}