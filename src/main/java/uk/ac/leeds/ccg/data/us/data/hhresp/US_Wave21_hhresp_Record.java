/**
 * Source code generated by uk.ac.leeds.ccg.andyt.generic.data.us.process.US_JavaCodeGenerator
 */
package uk.ac.leeds.ccg.data.us.data.hhresp;
public class US_Wave21_hhresp_Record extends US_hhresp_Record {
protected short CAROWN;
protected int CARVAL;
protected short CDUSE10;
protected short CDUSE11;
protected short CDUSE12;
protected byte CDUSE13;
protected short CDUSE3;
protected short CDUSE4;
protected byte CDUSE5;
protected byte CDUSE7;
protected byte COUNTRY;
protected byte CRBURG;
protected byte CRCAR;
protected byte CRDRNK;
protected byte CRGRAF;
protected byte CRMUGG;
protected byte CRRACE;
protected byte CRRUBSH;
protected byte CRTEEN;
protected byte CRVAND;
protected byte DUELPAY;
protected byte ELECPAY;
protected byte FF_HHSIZE;
protected byte FF_HSBEDS;
protected byte FF_HSOWND;
protected byte FF_HSROOMS;
protected byte FF_TEL;
protected double FIHHMNGRS1_DV;
protected double FIHHMNGRS_IF;
protected byte FIHHMNGRS_TC;
protected double FIHHMNINV_DV;
protected double FIHHMNLABGRS_DV;
protected byte FIHHMNLABGRS_TC;
protected double FIHHMNLABNET_DV;
protected double FIHHMNMISDV;
protected double FIHHMNNET1_DV;
protected double FIHHMNPEN_DV;
protected double FIHHMNPRBEN_DV;
protected double FIHHMNSBEN_DV;
protected byte FIHHNEGSEI_IF;
protected byte FUELDUEL;
protected byte FUELHAVE1;
protected byte FUELHAVE2;
protected byte FUELHAVE3;
protected byte FUELHAVE4;
protected byte FUELHAVE96;
protected byte GASPAY;
protected byte GRIMYN;
protected double HBADJUST_DV;
protected double HHDENUB_XW;
protected byte HHINTLANG;
protected byte HHLANG;
protected byte HHOLDMODEDV;
protected byte HHORIG;
protected byte HHRESP_DV;
protected byte HHTYPE_DV;
protected byte HIENDDATHH;
protected byte HIENDDATMM;
protected byte HIENDDATSS;
protected byte HISTRTDATHH;
protected byte HISTRTDATMM;
protected byte HISTRTDATSS;
protected double HOUSCOST1_DV;
protected double HOUSCOST2_DV;
protected int HRPID;
protected byte HRPNO;
protected byte HSBEDS;
protected short HSCTAX;
protected byte HSOWND;
protected byte HSOWNDCHK;
protected short HSOWR111;
protected short HSOWR112;
protected byte HSOWR113;
protected byte HSOWR114;
protected byte HSOWR115;
protected byte HSOWR116;
protected byte HSROOMCHK;
protected byte HSROOMS;
protected double IEQMOECD_DV;
protected short INTDATEY;
protected int INTNUM;
protected short IVFHO;
protected short IVH0;
protected short IVH11;
protected short IVH12;
protected byte IVH13;
protected byte IVH14;
protected byte IVH15;
protected byte IVH16;
protected byte IVLHBAL;
protected byte IVLHENG;
protected byte IVLHTRANS;
protected byte IVLHWHO;
protected short MGEXTRA;
protected int MGNEW;
protected int MGOLD;
protected byte MGTYPE;
protected short MGXTY1;
protected short MGXTY2;
protected short MGXTY3;
protected short MGXTY4;
protected byte MGXTY5;
protected byte MGXTY6;
protected byte MGXTY97;
protected byte MGYNOT;
protected byte MONTH;
protected byte N10TO15;
protected byte NADOECD_DV;
protected byte NCARS;
protected byte NCHOECD_DV;
protected short NCOUPLE_DV;
protected boolean NITYPE;
protected byte NKIDS015;
protected byte NOISYN;
protected byte NPENSIONER_DV;
protected byte NUE_DV;
protected byte NUMADULT;
protected byte NUNDER10;
protected byte NUNDER15;
protected short NWAGE_DV;
protected byte ORIGADD;
protected short OUTCOME;
protected byte PCBROAD;
protected byte PCHAS;
protected short PCNET;
protected int PSU;
protected short RENTG;
protected double RENTGRS_DV;
protected byte RENTGRS_IF;
protected byte RENTHB;
protected byte RENTINC1;
protected byte RENTINC2;
protected byte RENTINC3;
protected byte RENTINC96;
protected short RENTP11;
protected short RENTP12;
protected byte RENTP13;
protected byte RENTP14;
protected byte RENTP15;
protected byte RENTP16;
protected byte RENTWC;
protected double RENT_DV;
protected short STRATA;
protected short TENURE_DV;
protected byte URBAN_DV;
protected short XPALTOB_G3;
protected short XPDUELY;
protected short XPELECY;
protected short XPFDOUT_G3;
protected short XPFOOD1_G3;
protected short XPGASY;
protected byte XPHSDBA;
protected byte XPHSDCT;
protected double XPMGINT_DV;
protected double XPMG_DV;
protected byte XPMG_IF;
protected short XPOILY;
protected short XPSFLY;
protected final void initCAROWN(String s) {
if (!s.trim().isEmpty()) {
CAROWN = Short.parseShort(s);
} else {
CAROWN = Short.MIN_VALUE;
}
}

protected final void initCARVAL(String s) {
if (!s.trim().isEmpty()) {
CARVAL = Integer.parseInt(s);
} else {
CARVAL = Integer.MIN_VALUE;
}
}

protected final void initCDUSE10(String s) {
if (!s.trim().isEmpty()) {
CDUSE10 = Short.parseShort(s);
} else {
CDUSE10 = Short.MIN_VALUE;
}
}

protected final void initCDUSE11(String s) {
if (!s.trim().isEmpty()) {
CDUSE11 = Short.parseShort(s);
} else {
CDUSE11 = Short.MIN_VALUE;
}
}

protected final void initCDUSE12(String s) {
if (!s.trim().isEmpty()) {
CDUSE12 = Short.parseShort(s);
} else {
CDUSE12 = Short.MIN_VALUE;
}
}

protected final void initCDUSE13(String s) {
if (!s.trim().isEmpty()) {
CDUSE13 = Byte.parseByte(s);
} else {
CDUSE13 = Byte.MIN_VALUE;
}
}

protected final void initCDUSE3(String s) {
if (!s.trim().isEmpty()) {
CDUSE3 = Short.parseShort(s);
} else {
CDUSE3 = Short.MIN_VALUE;
}
}

protected final void initCDUSE4(String s) {
if (!s.trim().isEmpty()) {
CDUSE4 = Short.parseShort(s);
} else {
CDUSE4 = Short.MIN_VALUE;
}
}

protected final void initCDUSE5(String s) {
if (!s.trim().isEmpty()) {
CDUSE5 = Byte.parseByte(s);
} else {
CDUSE5 = Byte.MIN_VALUE;
}
}

protected final void initCDUSE7(String s) {
if (!s.trim().isEmpty()) {
CDUSE7 = Byte.parseByte(s);
} else {
CDUSE7 = Byte.MIN_VALUE;
}
}

protected final void initCOUNTRY(String s) {
if (!s.trim().isEmpty()) {
COUNTRY = Byte.parseByte(s);
} else {
COUNTRY = Byte.MIN_VALUE;
}
}

protected final void initCRBURG(String s) {
if (!s.trim().isEmpty()) {
CRBURG = Byte.parseByte(s);
} else {
CRBURG = Byte.MIN_VALUE;
}
}

protected final void initCRCAR(String s) {
if (!s.trim().isEmpty()) {
CRCAR = Byte.parseByte(s);
} else {
CRCAR = Byte.MIN_VALUE;
}
}

protected final void initCRDRNK(String s) {
if (!s.trim().isEmpty()) {
CRDRNK = Byte.parseByte(s);
} else {
CRDRNK = Byte.MIN_VALUE;
}
}

protected final void initCRGRAF(String s) {
if (!s.trim().isEmpty()) {
CRGRAF = Byte.parseByte(s);
} else {
CRGRAF = Byte.MIN_VALUE;
}
}

protected final void initCRMUGG(String s) {
if (!s.trim().isEmpty()) {
CRMUGG = Byte.parseByte(s);
} else {
CRMUGG = Byte.MIN_VALUE;
}
}

protected final void initCRRACE(String s) {
if (!s.trim().isEmpty()) {
CRRACE = Byte.parseByte(s);
} else {
CRRACE = Byte.MIN_VALUE;
}
}

protected final void initCRRUBSH(String s) {
if (!s.trim().isEmpty()) {
CRRUBSH = Byte.parseByte(s);
} else {
CRRUBSH = Byte.MIN_VALUE;
}
}

protected final void initCRTEEN(String s) {
if (!s.trim().isEmpty()) {
CRTEEN = Byte.parseByte(s);
} else {
CRTEEN = Byte.MIN_VALUE;
}
}

protected final void initCRVAND(String s) {
if (!s.trim().isEmpty()) {
CRVAND = Byte.parseByte(s);
} else {
CRVAND = Byte.MIN_VALUE;
}
}

protected final void initDUELPAY(String s) {
if (!s.trim().isEmpty()) {
DUELPAY = Byte.parseByte(s);
} else {
DUELPAY = Byte.MIN_VALUE;
}
}

protected final void initELECPAY(String s) {
if (!s.trim().isEmpty()) {
ELECPAY = Byte.parseByte(s);
} else {
ELECPAY = Byte.MIN_VALUE;
}
}

protected final void initFF_HHSIZE(String s) {
if (!s.trim().isEmpty()) {
FF_HHSIZE = Byte.parseByte(s);
} else {
FF_HHSIZE = Byte.MIN_VALUE;
}
}

protected final void initFF_HSBEDS(String s) {
if (!s.trim().isEmpty()) {
FF_HSBEDS = Byte.parseByte(s);
} else {
FF_HSBEDS = Byte.MIN_VALUE;
}
}

protected final void initFF_HSOWND(String s) {
if (!s.trim().isEmpty()) {
FF_HSOWND = Byte.parseByte(s);
} else {
FF_HSOWND = Byte.MIN_VALUE;
}
}

protected final void initFF_HSROOMS(String s) {
if (!s.trim().isEmpty()) {
FF_HSROOMS = Byte.parseByte(s);
} else {
FF_HSROOMS = Byte.MIN_VALUE;
}
}

protected final void initFF_TEL(String s) {
if (!s.trim().isEmpty()) {
FF_TEL = Byte.parseByte(s);
} else {
FF_TEL = Byte.MIN_VALUE;
}
}

protected final void initFIHHMNGRS1_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNGRS1_DV = Double.parseDouble(s);
} else {
FIHHMNGRS1_DV = Double.NaN;
}
}

protected final void initFIHHMNGRS_IF(String s) {
if (!s.trim().isEmpty()) {
FIHHMNGRS_IF = Double.parseDouble(s);
} else {
FIHHMNGRS_IF = Double.NaN;
}
}

protected final void initFIHHMNGRS_TC(String s) {
if (!s.trim().isEmpty()) {
FIHHMNGRS_TC = Byte.parseByte(s);
} else {
FIHHMNGRS_TC = Byte.MIN_VALUE;
}
}

protected final void initFIHHMNINV_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNINV_DV = Double.parseDouble(s);
} else {
FIHHMNINV_DV = Double.NaN;
}
}

protected final void initFIHHMNLABGRS_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNLABGRS_DV = Double.parseDouble(s);
} else {
FIHHMNLABGRS_DV = Double.NaN;
}
}

protected final void initFIHHMNLABGRS_TC(String s) {
if (!s.trim().isEmpty()) {
FIHHMNLABGRS_TC = Byte.parseByte(s);
} else {
FIHHMNLABGRS_TC = Byte.MIN_VALUE;
}
}

protected final void initFIHHMNLABNET_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNLABNET_DV = Double.parseDouble(s);
} else {
FIHHMNLABNET_DV = Double.NaN;
}
}

protected final void initFIHHMNMISDV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNMISDV = Double.parseDouble(s);
} else {
FIHHMNMISDV = Double.NaN;
}
}

protected final void initFIHHMNNET1_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNNET1_DV = Double.parseDouble(s);
} else {
FIHHMNNET1_DV = Double.NaN;
}
}

protected final void initFIHHMNPEN_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNPEN_DV = Double.parseDouble(s);
} else {
FIHHMNPEN_DV = Double.NaN;
}
}

protected final void initFIHHMNPRBEN_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNPRBEN_DV = Double.parseDouble(s);
} else {
FIHHMNPRBEN_DV = Double.NaN;
}
}

protected final void initFIHHMNSBEN_DV(String s) {
if (!s.trim().isEmpty()) {
FIHHMNSBEN_DV = Double.parseDouble(s);
} else {
FIHHMNSBEN_DV = Double.NaN;
}
}

protected final void initFIHHNEGSEI_IF(String s) {
if (!s.trim().isEmpty()) {
FIHHNEGSEI_IF = Byte.parseByte(s);
} else {
FIHHNEGSEI_IF = Byte.MIN_VALUE;
}
}

protected final void initFUELDUEL(String s) {
if (!s.trim().isEmpty()) {
FUELDUEL = Byte.parseByte(s);
} else {
FUELDUEL = Byte.MIN_VALUE;
}
}

protected final void initFUELHAVE1(String s) {
if (!s.trim().isEmpty()) {
FUELHAVE1 = Byte.parseByte(s);
} else {
FUELHAVE1 = Byte.MIN_VALUE;
}
}

protected final void initFUELHAVE2(String s) {
if (!s.trim().isEmpty()) {
FUELHAVE2 = Byte.parseByte(s);
} else {
FUELHAVE2 = Byte.MIN_VALUE;
}
}

protected final void initFUELHAVE3(String s) {
if (!s.trim().isEmpty()) {
FUELHAVE3 = Byte.parseByte(s);
} else {
FUELHAVE3 = Byte.MIN_VALUE;
}
}

protected final void initFUELHAVE4(String s) {
if (!s.trim().isEmpty()) {
FUELHAVE4 = Byte.parseByte(s);
} else {
FUELHAVE4 = Byte.MIN_VALUE;
}
}

protected final void initFUELHAVE96(String s) {
if (!s.trim().isEmpty()) {
FUELHAVE96 = Byte.parseByte(s);
} else {
FUELHAVE96 = Byte.MIN_VALUE;
}
}

protected final void initGASPAY(String s) {
if (!s.trim().isEmpty()) {
GASPAY = Byte.parseByte(s);
} else {
GASPAY = Byte.MIN_VALUE;
}
}

protected final void initGRIMYN(String s) {
if (!s.trim().isEmpty()) {
GRIMYN = Byte.parseByte(s);
} else {
GRIMYN = Byte.MIN_VALUE;
}
}

protected final void initHBADJUST_DV(String s) {
if (!s.trim().isEmpty()) {
HBADJUST_DV = Double.parseDouble(s);
} else {
HBADJUST_DV = Double.NaN;
}
}

protected final void initHHDENUB_XW(String s) {
if (!s.trim().isEmpty()) {
HHDENUB_XW = Double.parseDouble(s);
} else {
HHDENUB_XW = Double.NaN;
}
}

protected final void initHHINTLANG(String s) {
if (!s.trim().isEmpty()) {
HHINTLANG = Byte.parseByte(s);
} else {
HHINTLANG = Byte.MIN_VALUE;
}
}

protected final void initHHLANG(String s) {
if (!s.trim().isEmpty()) {
HHLANG = Byte.parseByte(s);
} else {
HHLANG = Byte.MIN_VALUE;
}
}

protected final void initHHOLDMODEDV(String s) {
if (!s.trim().isEmpty()) {
HHOLDMODEDV = Byte.parseByte(s);
} else {
HHOLDMODEDV = Byte.MIN_VALUE;
}
}

protected final void initHHORIG(String s) {
if (!s.trim().isEmpty()) {
HHORIG = Byte.parseByte(s);
} else {
HHORIG = Byte.MIN_VALUE;
}
}

protected final void initHHRESP_DV(String s) {
if (!s.trim().isEmpty()) {
HHRESP_DV = Byte.parseByte(s);
} else {
HHRESP_DV = Byte.MIN_VALUE;
}
}

protected final void initHHTYPE_DV(String s) {
if (!s.trim().isEmpty()) {
HHTYPE_DV = Byte.parseByte(s);
} else {
HHTYPE_DV = Byte.MIN_VALUE;
}
}

protected final void initHIENDDATHH(String s) {
if (!s.trim().isEmpty()) {
HIENDDATHH = Byte.parseByte(s);
} else {
HIENDDATHH = Byte.MIN_VALUE;
}
}

protected final void initHIENDDATMM(String s) {
if (!s.trim().isEmpty()) {
HIENDDATMM = Byte.parseByte(s);
} else {
HIENDDATMM = Byte.MIN_VALUE;
}
}

protected final void initHIENDDATSS(String s) {
if (!s.trim().isEmpty()) {
HIENDDATSS = Byte.parseByte(s);
} else {
HIENDDATSS = Byte.MIN_VALUE;
}
}

protected final void initHISTRTDATHH(String s) {
if (!s.trim().isEmpty()) {
HISTRTDATHH = Byte.parseByte(s);
} else {
HISTRTDATHH = Byte.MIN_VALUE;
}
}

protected final void initHISTRTDATMM(String s) {
if (!s.trim().isEmpty()) {
HISTRTDATMM = Byte.parseByte(s);
} else {
HISTRTDATMM = Byte.MIN_VALUE;
}
}

protected final void initHISTRTDATSS(String s) {
if (!s.trim().isEmpty()) {
HISTRTDATSS = Byte.parseByte(s);
} else {
HISTRTDATSS = Byte.MIN_VALUE;
}
}

protected final void initHOUSCOST1_DV(String s) {
if (!s.trim().isEmpty()) {
HOUSCOST1_DV = Double.parseDouble(s);
} else {
HOUSCOST1_DV = Double.NaN;
}
}

protected final void initHOUSCOST2_DV(String s) {
if (!s.trim().isEmpty()) {
HOUSCOST2_DV = Double.parseDouble(s);
} else {
HOUSCOST2_DV = Double.NaN;
}
}

protected final void initHRPID(String s) {
if (!s.trim().isEmpty()) {
HRPID = Integer.parseInt(s);
} else {
HRPID = Integer.MIN_VALUE;
}
}

protected final void initHRPNO(String s) {
if (!s.trim().isEmpty()) {
HRPNO = Byte.parseByte(s);
} else {
HRPNO = Byte.MIN_VALUE;
}
}

protected final void initHSBEDS(String s) {
if (!s.trim().isEmpty()) {
HSBEDS = Byte.parseByte(s);
} else {
HSBEDS = Byte.MIN_VALUE;
}
}

protected final void initHSCTAX(String s) {
if (!s.trim().isEmpty()) {
HSCTAX = Short.parseShort(s);
} else {
HSCTAX = Short.MIN_VALUE;
}
}

protected final void initHSOWND(String s) {
if (!s.trim().isEmpty()) {
HSOWND = Byte.parseByte(s);
} else {
HSOWND = Byte.MIN_VALUE;
}
}

protected final void initHSOWNDCHK(String s) {
if (!s.trim().isEmpty()) {
HSOWNDCHK = Byte.parseByte(s);
} else {
HSOWNDCHK = Byte.MIN_VALUE;
}
}

protected final void initHSOWR111(String s) {
if (!s.trim().isEmpty()) {
HSOWR111 = Short.parseShort(s);
} else {
HSOWR111 = Short.MIN_VALUE;
}
}

protected final void initHSOWR112(String s) {
if (!s.trim().isEmpty()) {
HSOWR112 = Short.parseShort(s);
} else {
HSOWR112 = Short.MIN_VALUE;
}
}

protected final void initHSOWR113(String s) {
if (!s.trim().isEmpty()) {
HSOWR113 = Byte.parseByte(s);
} else {
HSOWR113 = Byte.MIN_VALUE;
}
}

protected final void initHSOWR114(String s) {
if (!s.trim().isEmpty()) {
HSOWR114 = Byte.parseByte(s);
} else {
HSOWR114 = Byte.MIN_VALUE;
}
}

protected final void initHSOWR115(String s) {
if (!s.trim().isEmpty()) {
HSOWR115 = Byte.parseByte(s);
} else {
HSOWR115 = Byte.MIN_VALUE;
}
}

protected final void initHSOWR116(String s) {
if (!s.trim().isEmpty()) {
HSOWR116 = Byte.parseByte(s);
} else {
HSOWR116 = Byte.MIN_VALUE;
}
}

protected final void initHSROOMCHK(String s) {
if (!s.trim().isEmpty()) {
HSROOMCHK = Byte.parseByte(s);
} else {
HSROOMCHK = Byte.MIN_VALUE;
}
}

protected final void initHSROOMS(String s) {
if (!s.trim().isEmpty()) {
HSROOMS = Byte.parseByte(s);
} else {
HSROOMS = Byte.MIN_VALUE;
}
}

protected final void initIEQMOECD_DV(String s) {
if (!s.trim().isEmpty()) {
IEQMOECD_DV = Double.parseDouble(s);
} else {
IEQMOECD_DV = Double.NaN;
}
}

protected final void initINTDATEY(String s) {
if (!s.trim().isEmpty()) {
INTDATEY = Short.parseShort(s);
} else {
INTDATEY = Short.MIN_VALUE;
}
}

protected final void initINTNUM(String s) {
if (!s.trim().isEmpty()) {
INTNUM = Integer.parseInt(s);
} else {
INTNUM = Integer.MIN_VALUE;
}
}

protected final void initIVFHO(String s) {
if (!s.trim().isEmpty()) {
IVFHO = Short.parseShort(s);
} else {
IVFHO = Short.MIN_VALUE;
}
}

protected final void initIVH0(String s) {
if (!s.trim().isEmpty()) {
IVH0 = Short.parseShort(s);
} else {
IVH0 = Short.MIN_VALUE;
}
}

protected final void initIVH11(String s) {
if (!s.trim().isEmpty()) {
IVH11 = Short.parseShort(s);
} else {
IVH11 = Short.MIN_VALUE;
}
}

protected final void initIVH12(String s) {
if (!s.trim().isEmpty()) {
IVH12 = Short.parseShort(s);
} else {
IVH12 = Short.MIN_VALUE;
}
}

protected final void initIVH13(String s) {
if (!s.trim().isEmpty()) {
IVH13 = Byte.parseByte(s);
} else {
IVH13 = Byte.MIN_VALUE;
}
}

protected final void initIVH14(String s) {
if (!s.trim().isEmpty()) {
IVH14 = Byte.parseByte(s);
} else {
IVH14 = Byte.MIN_VALUE;
}
}

protected final void initIVH15(String s) {
if (!s.trim().isEmpty()) {
IVH15 = Byte.parseByte(s);
} else {
IVH15 = Byte.MIN_VALUE;
}
}

protected final void initIVH16(String s) {
if (!s.trim().isEmpty()) {
IVH16 = Byte.parseByte(s);
} else {
IVH16 = Byte.MIN_VALUE;
}
}

protected final void initIVLHBAL(String s) {
if (!s.trim().isEmpty()) {
IVLHBAL = Byte.parseByte(s);
} else {
IVLHBAL = Byte.MIN_VALUE;
}
}

protected final void initIVLHENG(String s) {
if (!s.trim().isEmpty()) {
IVLHENG = Byte.parseByte(s);
} else {
IVLHENG = Byte.MIN_VALUE;
}
}

protected final void initIVLHTRANS(String s) {
if (!s.trim().isEmpty()) {
IVLHTRANS = Byte.parseByte(s);
} else {
IVLHTRANS = Byte.MIN_VALUE;
}
}

protected final void initIVLHWHO(String s) {
if (!s.trim().isEmpty()) {
IVLHWHO = Byte.parseByte(s);
} else {
IVLHWHO = Byte.MIN_VALUE;
}
}

protected final void initMGEXTRA(String s) {
if (!s.trim().isEmpty()) {
MGEXTRA = Short.parseShort(s);
} else {
MGEXTRA = Short.MIN_VALUE;
}
}

protected final void initMGNEW(String s) {
if (!s.trim().isEmpty()) {
MGNEW = Integer.parseInt(s);
} else {
MGNEW = Integer.MIN_VALUE;
}
}

protected final void initMGOLD(String s) {
if (!s.trim().isEmpty()) {
MGOLD = Integer.parseInt(s);
} else {
MGOLD = Integer.MIN_VALUE;
}
}

protected final void initMGTYPE(String s) {
if (!s.trim().isEmpty()) {
MGTYPE = Byte.parseByte(s);
} else {
MGTYPE = Byte.MIN_VALUE;
}
}

protected final void initMGXTY1(String s) {
if (!s.trim().isEmpty()) {
MGXTY1 = Short.parseShort(s);
} else {
MGXTY1 = Short.MIN_VALUE;
}
}

protected final void initMGXTY2(String s) {
if (!s.trim().isEmpty()) {
MGXTY2 = Short.parseShort(s);
} else {
MGXTY2 = Short.MIN_VALUE;
}
}

protected final void initMGXTY3(String s) {
if (!s.trim().isEmpty()) {
MGXTY3 = Short.parseShort(s);
} else {
MGXTY3 = Short.MIN_VALUE;
}
}

protected final void initMGXTY4(String s) {
if (!s.trim().isEmpty()) {
MGXTY4 = Short.parseShort(s);
} else {
MGXTY4 = Short.MIN_VALUE;
}
}

protected final void initMGXTY5(String s) {
if (!s.trim().isEmpty()) {
MGXTY5 = Byte.parseByte(s);
} else {
MGXTY5 = Byte.MIN_VALUE;
}
}

protected final void initMGXTY6(String s) {
if (!s.trim().isEmpty()) {
MGXTY6 = Byte.parseByte(s);
} else {
MGXTY6 = Byte.MIN_VALUE;
}
}

protected final void initMGXTY97(String s) {
if (!s.trim().isEmpty()) {
MGXTY97 = Byte.parseByte(s);
} else {
MGXTY97 = Byte.MIN_VALUE;
}
}

protected final void initMGYNOT(String s) {
if (!s.trim().isEmpty()) {
MGYNOT = Byte.parseByte(s);
} else {
MGYNOT = Byte.MIN_VALUE;
}
}

protected final void initMONTH(String s) {
if (!s.trim().isEmpty()) {
MONTH = Byte.parseByte(s);
} else {
MONTH = Byte.MIN_VALUE;
}
}

protected final void initN10TO15(String s) {
if (!s.trim().isEmpty()) {
N10TO15 = Byte.parseByte(s);
} else {
N10TO15 = Byte.MIN_VALUE;
}
}

protected final void initNADOECD_DV(String s) {
if (!s.trim().isEmpty()) {
NADOECD_DV = Byte.parseByte(s);
} else {
NADOECD_DV = Byte.MIN_VALUE;
}
}

protected final void initNCARS(String s) {
if (!s.trim().isEmpty()) {
NCARS = Byte.parseByte(s);
} else {
NCARS = Byte.MIN_VALUE;
}
}

protected final void initNCHOECD_DV(String s) {
if (!s.trim().isEmpty()) {
NCHOECD_DV = Byte.parseByte(s);
} else {
NCHOECD_DV = Byte.MIN_VALUE;
}
}

protected final void initNCOUPLE_DV(String s) {
if (!s.trim().isEmpty()) {
NCOUPLE_DV = Short.parseShort(s);
} else {
NCOUPLE_DV = Short.MIN_VALUE;
}
}

protected final void initNITYPE(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -9) {
NITYPE = false;
} else {
NITYPE = true;
}
}
}

protected final void initNKIDS015(String s) {
if (!s.trim().isEmpty()) {
NKIDS015 = Byte.parseByte(s);
} else {
NKIDS015 = Byte.MIN_VALUE;
}
}

protected final void initNOISYN(String s) {
if (!s.trim().isEmpty()) {
NOISYN = Byte.parseByte(s);
} else {
NOISYN = Byte.MIN_VALUE;
}
}

protected final void initNPENSIONER_DV(String s) {
if (!s.trim().isEmpty()) {
NPENSIONER_DV = Byte.parseByte(s);
} else {
NPENSIONER_DV = Byte.MIN_VALUE;
}
}

protected final void initNUE_DV(String s) {
if (!s.trim().isEmpty()) {
NUE_DV = Byte.parseByte(s);
} else {
NUE_DV = Byte.MIN_VALUE;
}
}

protected final void initNUMADULT(String s) {
if (!s.trim().isEmpty()) {
NUMADULT = Byte.parseByte(s);
} else {
NUMADULT = Byte.MIN_VALUE;
}
}

protected final void initNUNDER10(String s) {
if (!s.trim().isEmpty()) {
NUNDER10 = Byte.parseByte(s);
} else {
NUNDER10 = Byte.MIN_VALUE;
}
}

protected final void initNUNDER15(String s) {
if (!s.trim().isEmpty()) {
NUNDER15 = Byte.parseByte(s);
} else {
NUNDER15 = Byte.MIN_VALUE;
}
}

protected final void initNWAGE_DV(String s) {
if (!s.trim().isEmpty()) {
NWAGE_DV = Short.parseShort(s);
} else {
NWAGE_DV = Short.MIN_VALUE;
}
}

protected final void initORIGADD(String s) {
if (!s.trim().isEmpty()) {
ORIGADD = Byte.parseByte(s);
} else {
ORIGADD = Byte.MIN_VALUE;
}
}

protected final void initOUTCOME(String s) {
if (!s.trim().isEmpty()) {
OUTCOME = Short.parseShort(s);
} else {
OUTCOME = Short.MIN_VALUE;
}
}

protected final void initPCBROAD(String s) {
if (!s.trim().isEmpty()) {
PCBROAD = Byte.parseByte(s);
} else {
PCBROAD = Byte.MIN_VALUE;
}
}

protected final void initPCHAS(String s) {
if (!s.trim().isEmpty()) {
PCHAS = Byte.parseByte(s);
} else {
PCHAS = Byte.MIN_VALUE;
}
}

protected final void initPCNET(String s) {
if (!s.trim().isEmpty()) {
PCNET = Short.parseShort(s);
} else {
PCNET = Short.MIN_VALUE;
}
}

protected final void initPSU(String s) {
if (!s.trim().isEmpty()) {
PSU = Integer.parseInt(s);
} else {
PSU = Integer.MIN_VALUE;
}
}

protected final void initRENTG(String s) {
if (!s.trim().isEmpty()) {
RENTG = Short.parseShort(s);
} else {
RENTG = Short.MIN_VALUE;
}
}

protected final void initRENTGRS_DV(String s) {
if (!s.trim().isEmpty()) {
RENTGRS_DV = Double.parseDouble(s);
} else {
RENTGRS_DV = Double.NaN;
}
}

protected final void initRENTGRS_IF(String s) {
if (!s.trim().isEmpty()) {
RENTGRS_IF = Byte.parseByte(s);
} else {
RENTGRS_IF = Byte.MIN_VALUE;
}
}

protected final void initRENTHB(String s) {
if (!s.trim().isEmpty()) {
RENTHB = Byte.parseByte(s);
} else {
RENTHB = Byte.MIN_VALUE;
}
}

protected final void initRENTINC1(String s) {
if (!s.trim().isEmpty()) {
RENTINC1 = Byte.parseByte(s);
} else {
RENTINC1 = Byte.MIN_VALUE;
}
}

protected final void initRENTINC2(String s) {
if (!s.trim().isEmpty()) {
RENTINC2 = Byte.parseByte(s);
} else {
RENTINC2 = Byte.MIN_VALUE;
}
}

protected final void initRENTINC3(String s) {
if (!s.trim().isEmpty()) {
RENTINC3 = Byte.parseByte(s);
} else {
RENTINC3 = Byte.MIN_VALUE;
}
}

protected final void initRENTINC96(String s) {
if (!s.trim().isEmpty()) {
RENTINC96 = Byte.parseByte(s);
} else {
RENTINC96 = Byte.MIN_VALUE;
}
}

protected final void initRENTP11(String s) {
if (!s.trim().isEmpty()) {
RENTP11 = Short.parseShort(s);
} else {
RENTP11 = Short.MIN_VALUE;
}
}

protected final void initRENTP12(String s) {
if (!s.trim().isEmpty()) {
RENTP12 = Short.parseShort(s);
} else {
RENTP12 = Short.MIN_VALUE;
}
}

protected final void initRENTP13(String s) {
if (!s.trim().isEmpty()) {
RENTP13 = Byte.parseByte(s);
} else {
RENTP13 = Byte.MIN_VALUE;
}
}

protected final void initRENTP14(String s) {
if (!s.trim().isEmpty()) {
RENTP14 = Byte.parseByte(s);
} else {
RENTP14 = Byte.MIN_VALUE;
}
}

protected final void initRENTP15(String s) {
if (!s.trim().isEmpty()) {
RENTP15 = Byte.parseByte(s);
} else {
RENTP15 = Byte.MIN_VALUE;
}
}

protected final void initRENTP16(String s) {
if (!s.trim().isEmpty()) {
RENTP16 = Byte.parseByte(s);
} else {
RENTP16 = Byte.MIN_VALUE;
}
}

protected final void initRENTWC(String s) {
if (!s.trim().isEmpty()) {
RENTWC = Byte.parseByte(s);
} else {
RENTWC = Byte.MIN_VALUE;
}
}

protected final void initRENT_DV(String s) {
if (!s.trim().isEmpty()) {
RENT_DV = Double.parseDouble(s);
} else {
RENT_DV = Double.NaN;
}
}

protected final void initSTRATA(String s) {
if (!s.trim().isEmpty()) {
STRATA = Short.parseShort(s);
} else {
STRATA = Short.MIN_VALUE;
}
}

protected final void initTENURE_DV(String s) {
if (!s.trim().isEmpty()) {
TENURE_DV = Short.parseShort(s);
} else {
TENURE_DV = Short.MIN_VALUE;
}
}

protected final void initURBAN_DV(String s) {
if (!s.trim().isEmpty()) {
URBAN_DV = Byte.parseByte(s);
} else {
URBAN_DV = Byte.MIN_VALUE;
}
}

protected final void initXPALTOB_G3(String s) {
if (!s.trim().isEmpty()) {
XPALTOB_G3 = Short.parseShort(s);
} else {
XPALTOB_G3 = Short.MIN_VALUE;
}
}

protected final void initXPDUELY(String s) {
if (!s.trim().isEmpty()) {
XPDUELY = Short.parseShort(s);
} else {
XPDUELY = Short.MIN_VALUE;
}
}

protected final void initXPELECY(String s) {
if (!s.trim().isEmpty()) {
XPELECY = Short.parseShort(s);
} else {
XPELECY = Short.MIN_VALUE;
}
}

protected final void initXPFDOUT_G3(String s) {
if (!s.trim().isEmpty()) {
XPFDOUT_G3 = Short.parseShort(s);
} else {
XPFDOUT_G3 = Short.MIN_VALUE;
}
}

protected final void initXPFOOD1_G3(String s) {
if (!s.trim().isEmpty()) {
XPFOOD1_G3 = Short.parseShort(s);
} else {
XPFOOD1_G3 = Short.MIN_VALUE;
}
}

protected final void initXPGASY(String s) {
if (!s.trim().isEmpty()) {
XPGASY = Short.parseShort(s);
} else {
XPGASY = Short.MIN_VALUE;
}
}

protected final void initXPHSDBA(String s) {
if (!s.trim().isEmpty()) {
XPHSDBA = Byte.parseByte(s);
} else {
XPHSDBA = Byte.MIN_VALUE;
}
}

protected final void initXPHSDCT(String s) {
if (!s.trim().isEmpty()) {
XPHSDCT = Byte.parseByte(s);
} else {
XPHSDCT = Byte.MIN_VALUE;
}
}

protected final void initXPMGINT_DV(String s) {
if (!s.trim().isEmpty()) {
XPMGINT_DV = Double.parseDouble(s);
} else {
XPMGINT_DV = Double.NaN;
}
}

protected final void initXPMG_DV(String s) {
if (!s.trim().isEmpty()) {
XPMG_DV = Double.parseDouble(s);
} else {
XPMG_DV = Double.NaN;
}
}

protected final void initXPMG_IF(String s) {
if (!s.trim().isEmpty()) {
XPMG_IF = Byte.parseByte(s);
} else {
XPMG_IF = Byte.MIN_VALUE;
}
}

protected final void initXPOILY(String s) {
if (!s.trim().isEmpty()) {
XPOILY = Short.parseShort(s);
} else {
XPOILY = Short.MIN_VALUE;
}
}

protected final void initXPSFLY(String s) {
if (!s.trim().isEmpty()) {
XPSFLY = Short.parseShort(s);
} else {
XPSFLY = Short.MIN_VALUE;
}
}

public short getCAROWN() {
return CAROWN;
}

public int getCARVAL() {
return CARVAL;
}

public short getCDUSE10() {
return CDUSE10;
}

public short getCDUSE11() {
return CDUSE11;
}

public short getCDUSE12() {
return CDUSE12;
}

public byte getCDUSE13() {
return CDUSE13;
}

public short getCDUSE3() {
return CDUSE3;
}

public short getCDUSE4() {
return CDUSE4;
}

public byte getCDUSE5() {
return CDUSE5;
}

public byte getCDUSE7() {
return CDUSE7;
}

public byte getCOUNTRY() {
return COUNTRY;
}

public byte getCRBURG() {
return CRBURG;
}

public byte getCRCAR() {
return CRCAR;
}

public byte getCRDRNK() {
return CRDRNK;
}

public byte getCRGRAF() {
return CRGRAF;
}

public byte getCRMUGG() {
return CRMUGG;
}

public byte getCRRACE() {
return CRRACE;
}

public byte getCRRUBSH() {
return CRRUBSH;
}

public byte getCRTEEN() {
return CRTEEN;
}

public byte getCRVAND() {
return CRVAND;
}

public byte getDUELPAY() {
return DUELPAY;
}

public byte getELECPAY() {
return ELECPAY;
}

public byte getFF_HHSIZE() {
return FF_HHSIZE;
}

public byte getFF_HSBEDS() {
return FF_HSBEDS;
}

public byte getFF_HSOWND() {
return FF_HSOWND;
}

public byte getFF_HSROOMS() {
return FF_HSROOMS;
}

public byte getFF_TEL() {
return FF_TEL;
}

protected double FIHHMNGRS1_DV() {
return FIHHMNGRS1_DV;
}

protected double FIHHMNGRS_IF() {
return FIHHMNGRS_IF;
}

public byte getFIHHMNGRS_TC() {
return FIHHMNGRS_TC;
}

protected double FIHHMNINV_DV() {
return FIHHMNINV_DV;
}

protected double FIHHMNLABGRS_DV() {
return FIHHMNLABGRS_DV;
}

public byte getFIHHMNLABGRS_TC() {
return FIHHMNLABGRS_TC;
}

protected double FIHHMNLABNET_DV() {
return FIHHMNLABNET_DV;
}

protected double FIHHMNMISDV() {
return FIHHMNMISDV;
}

protected double FIHHMNNET1_DV() {
return FIHHMNNET1_DV;
}

protected double FIHHMNPEN_DV() {
return FIHHMNPEN_DV;
}

protected double FIHHMNPRBEN_DV() {
return FIHHMNPRBEN_DV;
}

protected double FIHHMNSBEN_DV() {
return FIHHMNSBEN_DV;
}

public byte getFIHHNEGSEI_IF() {
return FIHHNEGSEI_IF;
}

public byte getFUELDUEL() {
return FUELDUEL;
}

public byte getFUELHAVE1() {
return FUELHAVE1;
}

public byte getFUELHAVE2() {
return FUELHAVE2;
}

public byte getFUELHAVE3() {
return FUELHAVE3;
}

public byte getFUELHAVE4() {
return FUELHAVE4;
}

public byte getFUELHAVE96() {
return FUELHAVE96;
}

public byte getGASPAY() {
return GASPAY;
}

public byte getGRIMYN() {
return GRIMYN;
}

protected double HBADJUST_DV() {
return HBADJUST_DV;
}

protected double HHDENUB_XW() {
return HHDENUB_XW;
}

public byte getHHINTLANG() {
return HHINTLANG;
}

public byte getHHLANG() {
return HHLANG;
}

public byte getHHOLDMODEDV() {
return HHOLDMODEDV;
}

public byte getHHORIG() {
return HHORIG;
}

public byte getHHRESP_DV() {
return HHRESP_DV;
}

public byte getHHTYPE_DV() {
return HHTYPE_DV;
}

public byte getHIENDDATHH() {
return HIENDDATHH;
}

public byte getHIENDDATMM() {
return HIENDDATMM;
}

public byte getHIENDDATSS() {
return HIENDDATSS;
}

public byte getHISTRTDATHH() {
return HISTRTDATHH;
}

public byte getHISTRTDATMM() {
return HISTRTDATMM;
}

public byte getHISTRTDATSS() {
return HISTRTDATSS;
}

protected double HOUSCOST1_DV() {
return HOUSCOST1_DV;
}

protected double HOUSCOST2_DV() {
return HOUSCOST2_DV;
}

public int getHRPID() {
return HRPID;
}

public byte getHRPNO() {
return HRPNO;
}

public byte getHSBEDS() {
return HSBEDS;
}

public short getHSCTAX() {
return HSCTAX;
}

public byte getHSOWND() {
return HSOWND;
}

public byte getHSOWNDCHK() {
return HSOWNDCHK;
}

public short getHSOWR111() {
return HSOWR111;
}

public short getHSOWR112() {
return HSOWR112;
}

public byte getHSOWR113() {
return HSOWR113;
}

public byte getHSOWR114() {
return HSOWR114;
}

public byte getHSOWR115() {
return HSOWR115;
}

public byte getHSOWR116() {
return HSOWR116;
}

public byte getHSROOMCHK() {
return HSROOMCHK;
}

public byte getHSROOMS() {
return HSROOMS;
}

protected double IEQMOECD_DV() {
return IEQMOECD_DV;
}

public short getINTDATEY() {
return INTDATEY;
}

public int getINTNUM() {
return INTNUM;
}

public short getIVFHO() {
return IVFHO;
}

public short getIVH0() {
return IVH0;
}

public short getIVH11() {
return IVH11;
}

public short getIVH12() {
return IVH12;
}

public byte getIVH13() {
return IVH13;
}

public byte getIVH14() {
return IVH14;
}

public byte getIVH15() {
return IVH15;
}

public byte getIVH16() {
return IVH16;
}

public byte getIVLHBAL() {
return IVLHBAL;
}

public byte getIVLHENG() {
return IVLHENG;
}

public byte getIVLHTRANS() {
return IVLHTRANS;
}

public byte getIVLHWHO() {
return IVLHWHO;
}

public short getMGEXTRA() {
return MGEXTRA;
}

public int getMGNEW() {
return MGNEW;
}

public int getMGOLD() {
return MGOLD;
}

public byte getMGTYPE() {
return MGTYPE;
}

public short getMGXTY1() {
return MGXTY1;
}

public short getMGXTY2() {
return MGXTY2;
}

public short getMGXTY3() {
return MGXTY3;
}

public short getMGXTY4() {
return MGXTY4;
}

public byte getMGXTY5() {
return MGXTY5;
}

public byte getMGXTY6() {
return MGXTY6;
}

public byte getMGXTY97() {
return MGXTY97;
}

public byte getMGYNOT() {
return MGYNOT;
}

public byte getMONTH() {
return MONTH;
}

public byte getN10TO15() {
return N10TO15;
}

public byte getNADOECD_DV() {
return NADOECD_DV;
}

public byte getNCARS() {
return NCARS;
}

public byte getNCHOECD_DV() {
return NCHOECD_DV;
}

public short getNCOUPLE_DV() {
return NCOUPLE_DV;
}

public boolean getNITYPE() {
return NITYPE;
}

public byte getNKIDS015() {
return NKIDS015;
}

public byte getNOISYN() {
return NOISYN;
}

public byte getNPENSIONER_DV() {
return NPENSIONER_DV;
}

public byte getNUE_DV() {
return NUE_DV;
}

public byte getNUMADULT() {
return NUMADULT;
}

public byte getNUNDER10() {
return NUNDER10;
}

public byte getNUNDER15() {
return NUNDER15;
}

public short getNWAGE_DV() {
return NWAGE_DV;
}

public byte getORIGADD() {
return ORIGADD;
}

public short getOUTCOME() {
return OUTCOME;
}

public byte getPCBROAD() {
return PCBROAD;
}

public byte getPCHAS() {
return PCHAS;
}

public short getPCNET() {
return PCNET;
}

public int getPSU() {
return PSU;
}

public short getRENTG() {
return RENTG;
}

protected double RENTGRS_DV() {
return RENTGRS_DV;
}

public byte getRENTGRS_IF() {
return RENTGRS_IF;
}

public byte getRENTHB() {
return RENTHB;
}

public byte getRENTINC1() {
return RENTINC1;
}

public byte getRENTINC2() {
return RENTINC2;
}

public byte getRENTINC3() {
return RENTINC3;
}

public byte getRENTINC96() {
return RENTINC96;
}

public short getRENTP11() {
return RENTP11;
}

public short getRENTP12() {
return RENTP12;
}

public byte getRENTP13() {
return RENTP13;
}

public byte getRENTP14() {
return RENTP14;
}

public byte getRENTP15() {
return RENTP15;
}

public byte getRENTP16() {
return RENTP16;
}

public byte getRENTWC() {
return RENTWC;
}

protected double RENT_DV() {
return RENT_DV;
}

public short getSTRATA() {
return STRATA;
}

public short getTENURE_DV() {
return TENURE_DV;
}

public byte getURBAN_DV() {
return URBAN_DV;
}

public short getXPALTOB_G3() {
return XPALTOB_G3;
}

public short getXPDUELY() {
return XPDUELY;
}

public short getXPELECY() {
return XPELECY;
}

public short getXPFDOUT_G3() {
return XPFDOUT_G3;
}

public short getXPFOOD1_G3() {
return XPFOOD1_G3;
}

public short getXPGASY() {
return XPGASY;
}

public byte getXPHSDBA() {
return XPHSDBA;
}

public byte getXPHSDCT() {
return XPHSDCT;
}

protected double XPMGINT_DV() {
return XPMGINT_DV;
}

protected double XPMG_DV() {
return XPMG_DV;
}

public byte getXPMG_IF() {
return XPMG_IF;
}

public short getXPOILY() {
return XPOILY;
}

public short getXPSFLY() {
return XPSFLY;
}

public US_Wave21_hhresp_Record(String line) {
s = line.split("\t");
initHIDP(s[0]);
initINTNUM(s[1]);
initHHORIG(s[2]);
initPSU(s[3]);
initSTRATA(s[4]);
initMONTH(s[5]);
initIVFHO(s[6]);
initNITYPE(s[7]);
initHHLANG(s[8]);
initHHSIZE(s[9]);
initNUMADULT(s[10]);
initNKIDS015(s[11]);
initNUNDER15(s[12]);
initNUNDER10(s[13]);
initN10TO15(s[14]);
initORIGADD(s[15]);
initIVH0(s[16]);
initIVH1(s[17]);
initIVH2(s[18]);
initIVH3(s[19]);
initIVH4(s[20]);
initIVH5(s[21]);
initIVH6(s[22]);
initIVH7(s[23]);
initIVH8(s[24]);
initIVH9(s[25]);
initIVH10(s[26]);
initIVH11(s[27]);
initIVH12(s[28]);
initIVH13(s[29]);
initIVH14(s[30]);
initIVH15(s[31]);
initIVH16(s[32]);
initHSROOMCHK(s[33]);
initHSBEDS(s[34]);
initHSROOMS(s[35]);
initHSOWNDCHK(s[36]);
initHSOWND(s[37]);
initHSOWR10(s[38]);
initHSOWR11(s[39]);
initHSOWR12(s[40]);
initHSOWR13(s[41]);
initHSOWR14(s[42]);
initHSOWR15(s[43]);
initHSOWR16(s[44]);
initHSOWR17(s[45]);
initHSOWR18(s[46]);
initHSOWR19(s[47]);
initHSOWR110(s[48]);
initHSOWR111(s[49]);
initHSOWR112(s[50]);
initHSOWR113(s[51]);
initHSOWR114(s[52]);
initHSOWR115(s[53]);
initHSOWR116(s[54]);
initHSVAL(s[55]);
initMGYNOT(s[56]);
initHSYRBUY(s[57]);
initHSCOST(s[58]);
initHSYR04(s[59]);
initMGOLD(s[60]);
initMGLIFE(s[61]);
initMGTYPE(s[62]);
initMGEXTRA(s[63]);
initMGNEW(s[64]);
initMGXTY1(s[65]);
initMGXTY2(s[66]);
initMGXTY3(s[67]);
initMGXTY4(s[68]);
initMGXTY5(s[69]);
initMGXTY6(s[70]);
initMGXTY97(s[71]);
initXPMG(s[72]);
initHSJB(s[73]);
initRENTP0(s[74]);
initRENTP1(s[75]);
initRENTP2(s[76]);
initRENTP3(s[77]);
initRENTP4(s[78]);
initRENTP5(s[79]);
initRENTP6(s[80]);
initRENTP7(s[81]);
initRENTP8(s[82]);
initRENTP9(s[83]);
initRENTP10(s[84]);
initRENTP11(s[85]);
initRENTP12(s[86]);
initRENTP13(s[87]);
initRENTP14(s[88]);
initRENTP15(s[89]);
initRENTP16(s[90]);
initRENTLL(s[91]);
initRENTF(s[92]);
initRENT(s[93]);
initRENTWC(s[94]);
initRENTINC1(s[95]);
initRENTINC2(s[96]);
initRENTINC3(s[97]);
initRENTINC96(s[98]);
initRENTHB(s[99]);
initRENTG(s[100]);
initFUELHAVE1(s[101]);
initFUELHAVE2(s[102]);
initFUELHAVE3(s[103]);
initFUELHAVE4(s[104]);
initFUELHAVE96(s[105]);
initFUELDUEL(s[106]);
initXPDUELY(s[107]);
initDUELPAY(s[108]);
initXPELECY(s[109]);
initELECPAY(s[110]);
initXPGASY(s[111]);
initGASPAY(s[112]);
initXPOILY(s[113]);
initXPSFLY(s[114]);
initHEATCH(s[115]);
initNOISYN(s[116]);
initGRIMYN(s[117]);
initCRGRAF(s[118]);
initCRRUBSH(s[119]);
initCRTEEN(s[120]);
initCRDRNK(s[121]);
initCRVAND(s[122]);
initCRRACE(s[123]);
initCRBURG(s[124]);
initCRCAR(s[125]);
initCRMUGG(s[126]);
initHSCTAX(s[127]);
initXPHSDB(s[128]);
initXPHSDCT(s[129]);
initXPHSDBA(s[130]);
initCDUSE1(s[131]);
initCDUSE2(s[132]);
initCDUSE3(s[133]);
initCDUSE4(s[134]);
initCDUSE5(s[135]);
initCDUSE6(s[136]);
initCDUSE7(s[137]);
initCDUSE8(s[138]);
initCDUSE9(s[139]);
initCDUSE10(s[140]);
initCDUSE11(s[141]);
initCDUSE12(s[142]);
initCDUSE13(s[143]);
initCDUSE96(s[144]);
initPCHAS(s[145]);
initPCNET(s[146]);
initPCBROAD(s[147]);
initXPFOOD1_G3(s[148]);
initXPFDOUT_G3(s[149]);
initXPALTOB_G3(s[150]);
initNCARS(s[151]);
initCAROWN(s[152]);
initCARVAL(s[153]);
initIVLHENG(s[154]);
initIVLHTRANS(s[155]);
initIVLHWHO(s[156]);
initIVLHBAL(s[157]);
initHHINTLANG(s[158]);
initOUTCOME(s[159]);
initHHOLDMODEDV(s[160]);
initINTDATED(s[161]);
initINTDATEM(s[162]);
initINTDATEY(s[163]);
initFIHHMNGRS_DV(s[164]);
initFIHHMNGRS_TC(s[165]);
initFIHHMNLABGRS_DV(s[166]);
initFIHHMNLABGRS_TC(s[167]);
initRENTGRS_IF(s[168]);
initXPMG_IF(s[169]);
initHISTRTDATHH(s[170]);
initHISTRTDATMM(s[171]);
initHISTRTDATSS(s[172]);
initHIENDDATHH(s[173]);
initHIENDDATMM(s[174]);
initHIENDDATSS(s[175]);
initFF_HHSIZE(s[176]);
initFF_TEL(s[177]);
initFF_HSBEDS(s[178]);
initFF_HSROOMS(s[179]);
initFF_HSOWND(s[180]);
initNPENSIONER_DV(s[181]);
initFIHHMNNET1_DV(s[182]);
initFIHHMNLABNET_DV(s[183]);
initFIHHMNMISDV(s[184]);
initFIHHMNPRBEN_DV(s[185]);
initFIHHMNINV_DV(s[186]);
initFIHHMNPEN_DV(s[187]);
initFIHHMNSBEN_DV(s[188]);
initRENT_DV(s[189]);
initRENTGRS_DV(s[190]);
initHBADJUST_DV(s[191]);
initXPMG_DV(s[192]);
initXPMGINT_DV(s[193]);
initHOUSCOST1_DV(s[194]);
initHOUSCOST2_DV(s[195]);
initFIHHMNGRS1_DV(s[196]);
initCOUNTRY(s[197]);
initGOR_DV(s[198]);
initURBAN_DV(s[199]);
initHHRESP_DV(s[200]);
initHHTYPE_DV(s[201]);
initHRPID(s[202]);
initHRPNO(s[203]);
initNCOUPLE_DV(s[204]);
initNONEPAR_DV(s[205]);
initNKIDS_DV(s[206]);
initNCH02_DV(s[207]);
initNCH34_DV(s[208]);
initNCH511_DV(s[209]);
initNCH1215_DV(s[210]);
initAGECHY_DV(s[211]);
initNPENS_DV(s[212]);
initNEMP_DV(s[213]);
initNUE_DV(s[214]);
initNWAGE_DV(s[215]);
initNCHOECD_DV(s[216]);
initNADOECD_DV(s[217]);
initIEQMOECD_DV(s[218]);
initTENURE_DV(s[219]);
initFIHHNEGSEI_IF(s[220]);
initFIHHMNGRS_IF(s[221]);
initHHDENUB_XW(s[222]);
}
}