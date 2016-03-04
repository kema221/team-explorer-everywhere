// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._DataSourceCredentials;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _DataSourceCredentials
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String dataSourceName;
    protected String userName;
    protected String password;

    public _DataSourceCredentials()
    {
        super();
    }

    public _DataSourceCredentials(
        final String dataSourceName,
        final String userName,
        final String password)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDataSourceName(dataSourceName);
        setUserName(userName);
        setPassword(password);
    }

    public String getDataSourceName()
    {
        return this.dataSourceName;
    }

    public void setDataSourceName(String value)
    {
        this.dataSourceName = value;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String value)
    {
        this.userName = value;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String value)
    {
        this.password = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "DataSourceName",
            this.dataSourceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "UserName",
            this.userName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Password",
            this.password);

        writer.writeEndElement();
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

                if (localName.equalsIgnoreCase("DataSourceName"))
                {
                    this.dataSourceName = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("UserName"))
                {
                    this.userName = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Password"))
                {
                    this.password = reader.getElementText();
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