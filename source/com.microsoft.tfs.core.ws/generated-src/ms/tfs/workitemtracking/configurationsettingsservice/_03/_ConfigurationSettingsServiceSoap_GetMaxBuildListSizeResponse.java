// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.configurationsettingsservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.configurationsettingsservice._03._ConfigurationSettingsServiceSoap_GetMaxBuildListSizeResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ConfigurationSettingsServiceSoap_GetMaxBuildListSizeResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected int getMaxBuildListSizeResult;

    public _ConfigurationSettingsServiceSoap_GetMaxBuildListSizeResponse()
    {
        super();
    }

    public _ConfigurationSettingsServiceSoap_GetMaxBuildListSizeResponse(final int getMaxBuildListSizeResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetMaxBuildListSizeResult(getMaxBuildListSizeResult);
    }

    public int getGetMaxBuildListSizeResult()
    {
        return this.getMaxBuildListSizeResult;
    }

    public void setGetMaxBuildListSizeResult(int value)
    {
        this.getMaxBuildListSizeResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("GetMaxBuildListSizeResult"))
                {
                    this.getMaxBuildListSizeResult = XMLConvert.toInt(reader.getElementText());
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
