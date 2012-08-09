/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.fs.local;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.fs.FsServerDefaults;

/** 
 * This class contains constants for configuration keys used
 * in the local file system, raw local fs and checksum fs.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public class LocalConfigKeys extends CommonConfigurationKeys {
  public static final String BLOCK_SIZE_KEY = "file.blocksize";
  public static final long BLOCK_SIZE_DEFAULT = 64*1024*1024;
  public static final String  REPLICATION_KEY = "file.replication";
  public static final short REPLICATION_DEFAULT = 1;
  public static final String STREAM_BUFFER_SIZE_KEY = "file.stream-buffer-size";
  public static final int STREAM_BUFFER_SIZE_DEFAULT = 4096;
  public static final String BYTES_PER_CHECKSUM_KEY = "file.bytes-per-checksum";
  public static final int BYTES_PER_CHECKSUM_DEFAULT = 512;
  public static final String CLIENT_WRITE_PACKET_SIZE_KEY =
                                                "file.client-write-packet-size";
  public static final int CLIENT_WRITE_PACKET_SIZE_DEFAULT = 64*1024;
  public static final boolean ENCRYPT_DATA_TRANSFER_DEFAULT = false;

  public static FsServerDefaults getServerDefaults() throws IOException {
    return new FsServerDefaults(
        BLOCK_SIZE_DEFAULT,
        BYTES_PER_CHECKSUM_DEFAULT,
        CLIENT_WRITE_PACKET_SIZE_DEFAULT,
        REPLICATION_DEFAULT,
        STREAM_BUFFER_SIZE_DEFAULT,
        ENCRYPT_DATA_TRANSFER_DEFAULT);
  }
}
  
