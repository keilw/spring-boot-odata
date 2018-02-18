package io.github.hwestphal.odata;

import org.apache.olingo.odata2.api.edm.Edm;

import io.github.hwestphal.odata.client.OdataClient;
import io.github.hwestphal.odata.server.OdataConfiguration;

public class OdataMaterialDemo {

	public static void main(String[] args) throws Exception {
		  OdataClient client;
		  client = new OdataClient("http://localhost:8030/sap/opu/odata/sap/ZGW_MATERIAL_SERVICE_SRV.svc/");
		  Edm meta = client.getMetadata();
		  System.out.println(meta);
	}

}
