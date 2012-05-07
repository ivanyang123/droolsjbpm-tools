/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.eclipse.task;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jbpm.eclipse.task.preferences.TaskConstants;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.drools.eclipse.task";

    // The shared instance
    private static Activator plugin;

    public Activator() {
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    public static Activator getDefault() {
        return plugin;
    }

    public static ImageDescriptor getImageDescriptor(String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    protected void initializeDefaultPreferences(IPreferenceStore store) {
        store.setDefault( TaskConstants.SERVER_IP_ADDRESS, "127.0.0.1");
        store.setDefault( TaskConstants.SERVER_PORT, 5445 );
        store.setDefault( TaskConstants.LANGUAGE, "en-UK" );
        store.setDefault( TaskConstants.TRANSPORT, "hornetq" );
    }

}
