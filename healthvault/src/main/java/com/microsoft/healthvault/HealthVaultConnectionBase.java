/*
 *  Copyright (c) Microsoft Corporation
 *
 *	All rights reserved. 
 *
 *	MIT License
 *	Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *  and associated documentation files (the ""Software""), to deal in the Software without
 *  restriction, including without limitation the rights to use, copy, modify, merge, publish,
 *  distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom
 *  the Software is furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in all copies or
 *  substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 *  BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.healthvault;

import com.microsoft.healthvault.client.*;
import com.microsoft.healthvault.methods.HealthVaultMethods;
import com.microsoft.healthvault.types.Guid;
import com.microsoft.healthvault.types.PersonInfo;

import java.util.concurrent.Future;

public abstract class HealthVaultConnectionBase implements IHealthVaultConnection { // TODO: (mikenev) fix implement chain.
    private Guid applicationId;
    private SessionCredential sessionCredential;
    private HealthVaultConfiguration configuration;

    public IPlatformClient createPlatformClient()
    {
        return new PlatformClient();
    }

    public IPersonClient createPersonClient()
    {
        return new PersonClient(this);
    }

    public IThingClient createThingClient()
    {
        return new ThingClient();
    }

    public IVocabularyClient createVocabularyClient()
    {
        return new VocabularyClient();
    }

    public Guid getApplicationId()
    {
        return this.applicationId;
    }

    public SessionCredential getSessionCredential()
    {
        return this.sessionCredential;
    }

    public void setSessionCredential(SessionCredential credential) {
        this.sessionCredential = credential;
    }

    public abstract Future<Void> authenticateAsync();

    public HealthServiceResponseData Execute(HealthVaultMethods method, int methodVersion, String parameters, Guid recordId, Guid correlationId)
    {
        // TODO: (mikenev) actually make the response data.
        return new HealthServiceResponseData();
    }

    public PersonInfo getPersonInfo()
    {
        // TODO: (mikenev) make the call to get person info.
        return new PersonInfo();
    }

    public void authenticate()
    {
        // TODO: (mikenev) make the authentication calls
    }

    public HealthVaultConfiguration getConfiguration()
    {
        return this.configuration;
    }

    protected void setConfiguration(HealthVaultConfiguration configuration)
    {
        this.configuration = configuration;
    }
}