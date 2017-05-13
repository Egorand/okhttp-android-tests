/*
 * Copyright 2017 Egor Andreevici
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.squareup.okhttp3;

import okhttp3.internal.platform.Platform;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class AndroidPlatformTest {

  @Test public void shouldCheckIfCleartextIsEnabled() {
    assertFalse(Platform.get().isCleartextTrafficPermitted("squareup.com"));
  }
}
