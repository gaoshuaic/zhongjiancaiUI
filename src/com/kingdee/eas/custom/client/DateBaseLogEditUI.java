/**
 * output package name
 */
package com.kingdee.eas.custom.client;

import java.awt.event.*;
import org.apache.log4j.Logger;

import com.kingdee.bos.BOSException;
import com.kingdee.bos.ui.face.CoreUIObject;
import com.kingdee.bos.dao.IObjectValue;
import com.kingdee.eas.common.EASBizException;
import com.kingdee.eas.framework.*;

/**
 * output class name
 */
public class DateBaseLogEditUI extends AbstractDateBaseLogEditUI
{
    private static final Logger logger = CoreUIObject.getLogger(DateBaseLogEditUI.class);
    
    /**
     * output class constructor
     */
    public DateBaseLogEditUI() throws Exception
    {
        super();
    }
    /**
     * output loadFields method
     */
    public void loadFields()
    {
        super.loadFields();
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
        objectValue.setCreator((com.kingdee.eas.base.permission.UserInfo)(com.kingdee.eas.common.client.SysContext.getSysContext().getCurrentUser()));
		
        return objectValue;
    }

}