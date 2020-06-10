/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.spi.stream;

public class LongMsgOffsetFactory implements StreamPartitionMsgOffsetFactory {
  @Override
  public void init(StreamConfig streamConfig) {
  }

  @Override
  public StreamPartitionMsgOffset create(String offsetStr) {
    return new LongMsgOffset(offsetStr);
  }

  @Override
  public StreamPartitionMsgOffset create(StreamPartitionMsgOffset other) {
    return new LongMsgOffset(other);
  }

  @Override
  public StreamPartitionMsgOffset createMaxOffset() {
    return new LongMsgOffset(Long.MAX_VALUE);
  }

  @Override
  public StreamPartitionMsgOffset createMinOffset() {
    return new LongMsgOffset(-1L);
  }
}