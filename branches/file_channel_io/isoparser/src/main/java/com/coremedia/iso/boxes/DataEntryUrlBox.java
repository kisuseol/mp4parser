/*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Only used within the DataReferenceBox. Find more information there.
 *
 * @see com.coremedia.iso.boxes.DataReferenceBox
 */
public class DataEntryUrlBox extends AbstractFullBox {
    public static final String TYPE = "url ";

    public DataEntryUrlBox() {
        super(TYPE);
    }

    @Override
    public void _parseDetails() {
        parseVersionAndFlags();
    }


    @Override
    protected void getContent(ByteBuffer bb ) throws IOException {
        writeVersionAndFlags(bb);
    }

    protected long getContentSize() {
        return 4;
    }

    public String toString() {
        return "DataEntryUrlBox[]";
    }
}