package Fibonachi;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class java

{
	// ---( internal utility methods )---

	final static java _instance = new java();

	static java _newInstance() { return new java(); }

	static java _cast(Object o) { return (java)o; }

	// ---( server methods )---




	public static final void addInts (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(addInts)>> ---
		// @sigtype java 3.5
		// [i] field:0:required int1
		// [i] field:0:required int2
		// [o] field:0:required value
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	int1 = IDataUtil.getString( pipelineCursor, "int1" );
			String	int2 = IDataUtil.getString( pipelineCursor, "int2" );
		pipelineCursor.destroy();
			
		int valueInt = Integer.parseInt(int1) + Integer.parseInt(int2);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "value", String.valueOf(valueInt) );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

