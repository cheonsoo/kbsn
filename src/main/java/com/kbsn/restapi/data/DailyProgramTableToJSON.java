package com.kbsn.restapi.data;

import com.kbsn.restapi.dto.DailyProgramTable;
import java.util.HashMap;
import java.util.Map;

public class DailyProgramTableToJSON {
	
	private Map<String, String> channel_code;
	private String double_programming;
	private String double_programming_code;
	private Map<String, String> media_code;
	private Map<String, String> onair_day_code;
//	private String onair_day;
//	private String onair_day_code;
	private String registration_date_time;
	private String schedule_key;
	private String update_time_date;
	private String[] relation_image;
	private String[] essence;
	private String episode_id;
	private String borad_code;
	private String program_code;
	private String programming_date;
	private String programming_duration_minute;
	private String programming_end_time;
	private String programming_start_time;
	private String program_sequence_number;
	private String program_title;
	private Map<String, String> programming_local_station_code;
	private Map<String, String> return_code;
	private String radio_open_studio_yn;
    private String service_date;
    private String service_start_time;
    private String service_end_time;
    private String programming_table_title;
    private Map<String, String> deliberation_grade_code;
    private String exist_episode;
    
    public DailyProgramTableToJSON() {}
    
    public DailyProgramTableToJSON(DailyProgramTable table) {
    	Map<String, String> map = new HashMap<String, String>();
    	
    	map.put("value", "N94");
    	map.put("label", table.getChannelName());
    	channel_code = map;
    	
    	double_programming_code = "1";
    	
    	map = new HashMap<String, String>();
    	map.put("value", "I9");
    	map.put("label", "N");
    	media_code = map;
    	
    	relation_image = new String[] {};
    	essence = new String[] {};
    	episode_id = "PI-1432252996-01-3AA";
    	borad_code = "";
    	program_code = "";
    	programming_date = table.getDate();
    	programming_duration_minute = "60";
    	programming_start_time = "05000000";
    	programming_end_time = "06000000";
    	program_sequence_number = "583";
    	program_title = table.getProgName();
    	
    	map = new HashMap<String, String>();
    	map.put("value", "00");
    	map.put("label", "본사");
    	programming_local_station_code = map;
    	
    	map = new HashMap<String, String>();
    	map.put("value", "02");
    	map.put("label", "재방");
    	return_code = map;
    	
    	radio_open_studio_yn = "";
        service_date = "20150601";
        service_start_time = "05000000";
        service_end_time = "06000000";
        programming_table_title = "";
        deliberation_grade_code = null;
        exist_episode = "N";
        
        map = new HashMap<String, String>();
    	map.put("value", "N77");
    	map.put("label", "20150608");
    	onair_day_code = map;
    	
    	registration_date_time = "08300000";
    	schedule_key = "N88";
    	update_time_date = "08000000";
    }

	public Map<String, String> getChannel_code() {
		return channel_code;
	}

	public void setChannel_code(Map<String, String> channel_code) {
		this.channel_code = channel_code;
	}

	public String getDouble_programming_code() {
		return double_programming_code;
	}

	public void setDouble_programming_code(String double_programming_code) {
		this.double_programming_code = double_programming_code;
	}

	public Map<String, String> getMedia_code() {
		return media_code;
	}

	public void setMedia_code(Map<String, String> media_code) {
		this.media_code = media_code;
	}

	public String[] getRelation_image() {
		return relation_image;
	}

	public void setRelation_image(String[] relation_image) {
		this.relation_image = relation_image;
	}

	public String[] getEssence() {
		return essence;
	}

	public void setEssence(String[] essence) {
		this.essence = essence;
	}

	public String getEpisode_id() {
		return episode_id;
	}

	public void setEpisode_id(String episode_id) {
		this.episode_id = episode_id;
	}

	public String getBorad_code() {
		return borad_code;
	}

	public void setBorad_code(String borad_code) {
		this.borad_code = borad_code;
	}

	public String getProgram_code() {
		return program_code;
	}

	public void setProgram_code(String program_code) {
		this.program_code = program_code;
	}

	public String getProgramming_date() {
		return programming_date;
	}

	public void setProgramming_date(String programming_date) {
		this.programming_date = programming_date;
	}

	public String getProgramming_duration_minute() {
		return programming_duration_minute;
	}

	public void setProgramming_duration_minute(String programming_duration_minute) {
		this.programming_duration_minute = programming_duration_minute;
	}

	public String getProgramming_end_time() {
		return programming_end_time;
	}

	public void setProgramming_end_time(String programming_end_time) {
		this.programming_end_time = programming_end_time;
	}

	public String getProgramming_start_time() {
		return programming_start_time;
	}

	public void setProgramming_start_time(String programming_start_time) {
		this.programming_start_time = programming_start_time;
	}

	public String getProgram_sequence_number() {
		return program_sequence_number;
	}

	public void setProgram_sequence_number(String program_sequence_number) {
		this.program_sequence_number = program_sequence_number;
	}

	public String getProgram_title() {
		return program_title;
	}

	public void setProgram_title(String program_title) {
		this.program_title = program_title;
	}

	public Map<String, String> getProgramming_local_station_code() {
		return programming_local_station_code;
	}

	public void setProgramming_local_station_code(
			Map<String, String> programming_local_station_code) {
		this.programming_local_station_code = programming_local_station_code;
	}

	public Map<String, String> getReturn_code() {
		return return_code;
	}

	public void setReturn_code(Map<String, String> return_code) {
		this.return_code = return_code;
	}

	public String getRadio_open_studio_yn() {
		return radio_open_studio_yn;
	}

	public void setRadio_open_studio_yn(String radio_open_studio_yn) {
		this.radio_open_studio_yn = radio_open_studio_yn;
	}

	public String getService_date() {
		return service_date;
	}

	public void setService_date(String service_date) {
		this.service_date = service_date;
	}

	public String getService_start_time() {
		return service_start_time;
	}

	public void setService_start_time(String service_start_time) {
		this.service_start_time = service_start_time;
	}

	public String getService_end_time() {
		return service_end_time;
	}

	public void setService_end_time(String service_end_time) {
		this.service_end_time = service_end_time;
	}

	public String getProgramming_table_title() {
		return programming_table_title;
	}

	public void setProgramming_table_title(String programming_table_title) {
		this.programming_table_title = programming_table_title;
	}

	public Map<String, String> getDeliberation_grade_code() {
		return deliberation_grade_code;
	}

	public void setDeliberation_grade_code(
			Map<String, String> deliberation_grade_code) {
		this.deliberation_grade_code = deliberation_grade_code;
	}

	public String getExist_episode() {
		return exist_episode;
	}

	public void setExist_episode(String exist_episode) {
		this.exist_episode = exist_episode;
	}
	public String getDouble_programming() {
		return double_programming;
	}

	public void setDouble_programming(String double_programming) {
		this.double_programming = double_programming;
	}

	public Map<String, String> getOnair_day_code() {
		return onair_day_code;
	}

	public void setOnair_day_code(Map<String, String> onair_day_code) {
		this.onair_day_code = onair_day_code;
	}

	public String getRegistration_date_time() {
		return registration_date_time;
	}

	public void setRegistration_date_time(String registration_date_time) {
		this.registration_date_time = registration_date_time;
	}

	public String getSchedule_key() {
		return schedule_key;
	}

	public void setSchedule_key(String schedule_key) {
		this.schedule_key = schedule_key;
	}

	public String getUpdate_time_date() {
		return update_time_date;
	}

	public void setUpdate_time_date(String update_time_date) {
		this.update_time_date = update_time_date;
	}    
}
