
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.gomeo2o.service.account.rb;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.7
 * Tue Dec 08 10:20:34 CST 2015
 * Generated source version: 2.2.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "AcceptBalanceTaskImplService",
                      portName = "AcceptBalanceTaskImplPort",
                      targetNamespace = "http://impl.webservice.rb.gome.founder.com/",
                      wsdlLocation = "http://rbuat.ds.gome.com.cn/ws/acceptBalanceTask?wsdl",
                      endpointInterface = "com.gomeo2o.service.account.rb.AcceptBalanceTask")
                      
public class AcceptBalanceTaskImpl implements AcceptBalanceTask {

    private static final Logger LOG = Logger.getLogger(AcceptBalanceTaskImpl.class.getName());

    /* (non-Javadoc)
     * @see com.gomeo2o.service.account.rb.AcceptBalanceTask#acceptBalanceTask(com.gomeo2o.service.account.rb.RefundBalanceTask  taskBean )*
     */
    public com.gomeo2o.service.account.rb.RefundTaskReply acceptBalanceTask(com.gomeo2o.service.account.rb.RefundBalanceTask taskBean) { 
        LOG.info("Executing operation acceptBalanceTask");
        System.out.println(taskBean);
        try {
            com.gomeo2o.service.account.rb.RefundTaskReply _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}