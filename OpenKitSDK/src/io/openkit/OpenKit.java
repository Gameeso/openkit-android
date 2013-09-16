/**
 * Copyright 2012 OpenKit
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.openkit;

import android.content.Context;

public class OpenKit {
	/**
	 * Initialize the OpenKit SDK. Should be called from your onCreate methods
	 * @param context A context (usually the activity)
	 * @param OKAppID Your OpenKit application ID, taken from the developer dashboard
	 */
	public static void initialize(Context context, String appKey, String secretKey)
	{
		OKManager.INSTANCE.initialize(context, appKey, secretKey);
	}
	
	/**
	 * Get current OKUser
	 * @return Returns OKUser, or null if not logged in
	 */
	public static OKUser getCurrentUser()
	{
		return OKManager.INSTANCE.getCurrentUser();
	}
	
	/**
	 * @return Returns the OpenKit application ID.
	 */
	public static String getAppKey()
	{
		return OKManager.INSTANCE.getAppKey();
	}
	
	/**
	 * Sets the base URL that the OpenKit SDK will use
	 * @param endpoint
	 */
	public static void setEndpoint(String endpoint)
	{
		OKLog.d("OpenKit endpoint set to: " + endpoint);
		OKHTTPClient.setEndpoint(endpoint);
	}
	
}
