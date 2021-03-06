/*
 * Copyright (c) 2010-2010 LinkedIn, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.linkedin.glu.agent.api

/**
 * @author ypujante@linkedin.com
 *
 */
public class DuplicateMountPointException extends AgentException
{
  private static final long serialVersionUID = 1L;

  public DuplicateMountPointException()
  {
  }

  public DuplicateMountPointException(MountPoint mp)
  {
    this(mp?.toString())
  }

  public DuplicateMountPointException(String s)
  {
    super(s);
  }

  public DuplicateMountPointException(String s, Throwable throwable)
  {
    super(s, throwable);
  }

  public DuplicateMountPointException(Throwable throwable)
  {
    super(throwable);
  }
}
