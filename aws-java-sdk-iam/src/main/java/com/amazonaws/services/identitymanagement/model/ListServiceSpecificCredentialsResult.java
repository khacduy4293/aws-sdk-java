/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListServiceSpecificCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceSpecificCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of structures that each contain details about a service-specific credential.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceSpecificCredentialMetadata> serviceSpecificCredentials;

    /**
     * <p>
     * A list of structures that each contain details about a service-specific credential.
     * </p>
     * 
     * @return A list of structures that each contain details about a service-specific credential.
     */

    public java.util.List<ServiceSpecificCredentialMetadata> getServiceSpecificCredentials() {
        if (serviceSpecificCredentials == null) {
            serviceSpecificCredentials = new com.amazonaws.internal.SdkInternalList<ServiceSpecificCredentialMetadata>();
        }
        return serviceSpecificCredentials;
    }

    /**
     * <p>
     * A list of structures that each contain details about a service-specific credential.
     * </p>
     * 
     * @param serviceSpecificCredentials
     *        A list of structures that each contain details about a service-specific credential.
     */

    public void setServiceSpecificCredentials(java.util.Collection<ServiceSpecificCredentialMetadata> serviceSpecificCredentials) {
        if (serviceSpecificCredentials == null) {
            this.serviceSpecificCredentials = null;
            return;
        }

        this.serviceSpecificCredentials = new com.amazonaws.internal.SdkInternalList<ServiceSpecificCredentialMetadata>(serviceSpecificCredentials);
    }

    /**
     * <p>
     * A list of structures that each contain details about a service-specific credential.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceSpecificCredentials(java.util.Collection)} or
     * {@link #withServiceSpecificCredentials(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serviceSpecificCredentials
     *        A list of structures that each contain details about a service-specific credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceSpecificCredentialsResult withServiceSpecificCredentials(ServiceSpecificCredentialMetadata... serviceSpecificCredentials) {
        if (this.serviceSpecificCredentials == null) {
            setServiceSpecificCredentials(new com.amazonaws.internal.SdkInternalList<ServiceSpecificCredentialMetadata>(serviceSpecificCredentials.length));
        }
        for (ServiceSpecificCredentialMetadata ele : serviceSpecificCredentials) {
            this.serviceSpecificCredentials.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of structures that each contain details about a service-specific credential.
     * </p>
     * 
     * @param serviceSpecificCredentials
     *        A list of structures that each contain details about a service-specific credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceSpecificCredentialsResult withServiceSpecificCredentials(
            java.util.Collection<ServiceSpecificCredentialMetadata> serviceSpecificCredentials) {
        setServiceSpecificCredentials(serviceSpecificCredentials);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceSpecificCredentials() != null)
            sb.append("ServiceSpecificCredentials: ").append(getServiceSpecificCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceSpecificCredentialsResult == false)
            return false;
        ListServiceSpecificCredentialsResult other = (ListServiceSpecificCredentialsResult) obj;
        if (other.getServiceSpecificCredentials() == null ^ this.getServiceSpecificCredentials() == null)
            return false;
        if (other.getServiceSpecificCredentials() != null && other.getServiceSpecificCredentials().equals(this.getServiceSpecificCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceSpecificCredentials() == null) ? 0 : getServiceSpecificCredentials().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceSpecificCredentialsResult clone() {
        try {
            return (ListServiceSpecificCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}