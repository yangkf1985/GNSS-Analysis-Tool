// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.abecerra.pvt_ephemeris_client.suplclient.asn1.supl2.rrlp_components_ver12;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Object;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Sequence;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Tag;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStream;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStreamReader;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.SequenceComponent;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.supl2.rrlp_components.GANSSIonoStormFlags;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.supl2.rrlp_components.GANSSIonosphereModelV12;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GANSSIonosphericModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSIonosphericModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSIonosphericModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSIonosphericModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSIonosphericModel != null) {
      return ImmutableList.of(TAG_GANSSIonosphericModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSIonosphericModel from encoded stream.
   */
  public static GANSSIonosphericModel fromPerUnaligned(byte[] encodedBytes) {
    GANSSIonosphericModel result = new GANSSIonosphericModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSIonosphericModel from encoded stream.
   */
  public static GANSSIonosphericModel fromPerAligned(byte[] encodedBytes) {
    GANSSIonosphericModel result = new GANSSIonosphericModel();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private GANSSIonosphereModelV12 ganssIonoModel_;
  public GANSSIonosphereModelV12 getGanssIonoModel() {
    return ganssIonoModel_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonosphereModelV12
   */
  public void setGanssIonoModel(Asn1Object value) {
    this.ganssIonoModel_ = (GANSSIonosphereModelV12) value;
  }
  public GANSSIonosphereModelV12 setGanssIonoModelToNewInstance() {
    ganssIonoModel_ = new GANSSIonosphereModelV12();
    return ganssIonoModel_;
  }
  
  private GANSSIonoStormFlags ganssIonoStormFlags_;
  public GANSSIonoStormFlags getGanssIonoStormFlags() {
    return ganssIonoStormFlags_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonoStormFlags
   */
  public void setGanssIonoStormFlags(Asn1Object value) {
    this.ganssIonoStormFlags_ = (GANSSIonoStormFlags) value;
  }
  public GANSSIonoStormFlags setGanssIonoStormFlagsToNewInstance() {
    ganssIonoStormFlags_ = new GANSSIonoStormFlags();
    return ganssIonoStormFlags_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssIonoModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssIonoModel();
          }

          @Override public void setToNewInstance() {
            setGanssIonoModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonosphereModelV12.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "ganssIonoModel : "
                    + getGanssIonoModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssIonoStormFlags() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssIonoStormFlags();
          }

          @Override public void setToNewInstance() {
            setGanssIonoStormFlagsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonoStormFlags.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "ganssIonoStormFlags : "
                    + getGanssIonoStormFlags().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  
  
  
  

    

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("GANSSIonosphericModel = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
