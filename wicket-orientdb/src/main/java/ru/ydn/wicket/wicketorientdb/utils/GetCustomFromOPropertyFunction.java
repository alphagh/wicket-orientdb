package ru.ydn.wicket.wicketorientdb.utils;

import java.io.Serializable;

import com.google.common.base.Function;
import com.orientechnologies.orient.core.metadata.schema.OProperty;

public class GetCustomFromOPropertyFunction implements Function<OProperty, String>, Serializable
{
	private final String customName;
	
	public GetCustomFromOPropertyFunction(String customName)
	{
		this.customName = customName;
	}

	@Override
	public String apply(OProperty input) {
		return input.getCustom(customName);
	}

}
