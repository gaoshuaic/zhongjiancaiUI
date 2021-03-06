package com.kingdee.eas.custom;

import com.kingdee.bos.BOSException;
//import com.kingdee.bos.metadata.*;
import com.kingdee.bos.framework.*;
import com.kingdee.bos.util.*;
import com.kingdee.bos.Context;

import com.kingdee.bos.Context;
import com.kingdee.bos.BOSException;
import com.kingdee.bos.dao.IObjectPK;
import com.kingdee.bos.metadata.entity.EntityViewInfo;
import java.lang.String;
import com.kingdee.eas.framework.CoreBaseInfo;
import com.kingdee.eas.framework.CoreBaseCollection;
import com.kingdee.bos.framework.*;
import com.kingdee.eas.framework.IDataBase;
import com.kingdee.eas.common.EASBizException;
import com.kingdee.bos.metadata.entity.SelectorItemCollection;
import com.kingdee.bos.util.*;

public interface IEAIDataBaseType extends IDataBase
{
    public EAIDataBaseTypeInfo getEAIDataBaseTypeInfo(IObjectPK pk) throws BOSException, EASBizException;
    public EAIDataBaseTypeInfo getEAIDataBaseTypeInfo(IObjectPK pk, SelectorItemCollection selector) throws BOSException, EASBizException;
    public EAIDataBaseTypeInfo getEAIDataBaseTypeInfo(String oql) throws BOSException, EASBizException;
    public EAIDataBaseTypeCollection getEAIDataBaseTypeCollection() throws BOSException;
    public EAIDataBaseTypeCollection getEAIDataBaseTypeCollection(EntityViewInfo view) throws BOSException;
    public EAIDataBaseTypeCollection getEAIDataBaseTypeCollection(String oql) throws BOSException;
}