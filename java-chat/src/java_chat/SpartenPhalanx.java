package java_chat;

import java.util.HashMap;

public class SpartenPhalanx
{
	HashMap<String, DateTime> connectionProtocol = new HashMap<String, DateTime>(); //fehlerhaftes Datetime whyever
	
	protected Boolean identifyDDos(String ip)
	{
		//ip mit zeitstempel zur hashmap hinzuf�gen
		if(/* pr�fen ob sich die ip schon mal in den letzten 2 sec schonmal verbinden wollte*/)
		{
			//return true wenn es ein DDos ist
		}
		else
		{
			//return false wenn es kein DDos ist.
		}
	}
	
	// alle 10 sec die hashmap leeren -- thread
}
