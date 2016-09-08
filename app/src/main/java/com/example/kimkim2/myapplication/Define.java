package com.example.kimkim2.myapplication;

/**
 * @설명 : API URI, OAuth 관련 키등 정의
 * @클래스명 : Define
 *
 */
public final class Define {

    public final class OAuth {
        public static final String CLIENT_ID =  "jihoon";
        public static final String SECRET 	 = 	"joshua787";
        public static final String KEY 		 = 	"17a82275-ae41-30b6-8ad4-67f929b71596";
    }

    /**
     * GOOGLE 콘솔에서 등록한 API 키 정의 : 구글캘린더
     */

    public static long ALARM_START_TIME = 0; //경로찾기 시작한 시간

    public static final String VERSION = "1";

    /**  이동 알리미 API CALL URI  */

    /**통합 검색 */
    public static final String TMAP_TOTAL_SEARCH_URI = "https://apis.skplanetx.com/tmap/pois";

    /** 좌표 변환**/
    public static final String TMAP_CONVERT_COORDINATE_URI = "https://apis.skplanetx.com/tmap/geo/coordconvert";

    /** Reverse Geo Coding */
    public static final String TMAP_REVERSE_GEOCODING_URI = "https://apis.skplanetx.com/tmap/geo/reversegeocoding";
}