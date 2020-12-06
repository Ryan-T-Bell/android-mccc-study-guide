package database

import android.util.Log

//var arrQuestionDeck: Array<String> = csvQuestionDeck.split(",").toTypedArray()
class QuestionsDeck constructor(subject: String){
    private val TAG = "QuestionDb"

    private var questionsDeck: MutableMap<String, Questions> = mutableMapOf()

    init {
        Log.d(TAG, "Initialize QuestionList")

        // Switch to decide which QuestionList to initialize
        when(subject) {
            "Entrance Exam" -> loadEntranceExamQuestions(subject)
            "A1" -> loadA1Questions(subject)
            "A2" -> loadA2Questions(subject)
            "A3" -> loadA3Questions(subject)
            "A4" -> loadA4Questions(subject)
            "B1" -> loadB1Questions(subject)
            "B2" -> loadB2Questions(subject)
            "B3" -> loadB3Questions(subject)
            "B4" -> loadB4Questions(subject)
            "Final Exam" -> loadFinalExamQuestions(subject)
        }
    }

    /**
     * Read study_guid.db, Questions TABLE and insert stored values
     */
    fun insertStoredValuesFromDatabase() {

        for ((key, question) in questionsDeck) {
            Log.d(TAG, "Load Correct/Incorrect -> $key")

            // questionDeck[key].setDatabaseValues(correct, incorrect)
        }
    }

    // 0. Entrance Exam
    private fun loadEntranceExamQuestions(subject: String) {
        loadDoctrinalConcepts(subject)
        loadTacticalTasksAndGraphics(subject)
        loadUsWeaponSystems(subject)
        loadThreatWeaponSystems(subject)
        loadUnitSymbols(subject)
    }

    private fun loadDoctrinalConcepts(subject: String) {
        val category = "Doctrinal Concepts"
        with(questionsDeck) {
            put("EE_0", Questions(subject, category,"Troop Leading Procedures (FM 6-0)","1) Receive the Mission\n2) Issue a warning order\n3) Make a tentative plan\n4) Initiate movement\n5) Conduct reconnaissance\n6) Complete the plan\n7) Issue the order\n8) Supervise and refine\n"))
            put("EE_1", Questions(subject, category,"Tenets of Unified Land Operations (ADRP 3-0)", "1) Depth\n2) Flexibility\n3) Simultaneity\n4) Synchronization\n"))
            put("EE_2", Questions(subject, category,"Foundations of Unified Land Operations (ADRP 3-0)", "1) Initiative\n2) Decisive Action\n3) Army Core Competencies\n4) Mission Command"))
            put("EE_3", Questions(subject, category,"Principles of Joint Operations (ADRP 3-90)", "1) Objective\n2) Offensive\n3) Mass\n4) Maneuver\n5) Economy of Force\n6) Unity of Command\n7) Security\n8) Surprise\n9) Simplicity\n10) Restraint\n11) Perseverance\n12) Legitimacy"))
            put("EE_4", Questions(subject, category,"Steps of Information Preparation of the Battlefield", "1) Define the operational environment\n2) Describe environmental effects on operations\n3) Evaluate the threat\n4) Determine the threat"))
            put("EE_5", Questions(subject, category, "The Mission Statement", "Who - (the unit)\nWhat - (the unit's essential task and type of operation)\nWhen - (time given in the higher-level OPORD)\nWhere - (the objective or location stated in higher's OPORD)\nWhy - (the unit purpose, taken from higher's concept of the operation)"))
            put("EE_6", Questions(subject, category,"Engagement Area Development", "1) Identify the enemy avenues of approach\n2) Determine the enemy scheme of maneuver\n3) Determine where to kill the enemy\n4) Plan and integrate obstacles\n5) Emplace direct fire weapon systems\n6) Plan and integrate indirect fires\n7) Rehearse the engagement"))
            put("EE_7", Questions(subject, category,"Decisive Point (ADRP 1-02)", "A geographic place, specific key event, critical factor, or function that when acted upon allows commanders to gain a marked advantage over an adversary or contribute materially to achieve success."))
            put("EE_8", Questions(subject, category, "Offensive Tasks (ADRP 3-90)", "1) Movement to Contact\n2) Attack\n3) Exploitation\n 4) Pursuit"))
            put("EE_9", Questions(subject, category, "Defensive Tasks (ADRP 3-90-1)", "1) Area Defense\n2) Mobile Defense\n3) Retrograde"))
            put("EE_10", Questions(subject, category,"Characteristics of the Offense (ADRP 3-90)", "1) Surprise\n2) Concentration\n3) Audacity\n4) Tempo"))
            put("EE_11", Questions(subject, category,"Characteristics of the Defense (ADRP 3-90)", "1) Disruption\n2) Flexibility\n3) Maneuver\n4) Mass and Concentration\n5) Operations in Depth\n6) Preparation\n7) Security"))
            put("EE_12", Questions(subject, category, "Levels of War (ADP 1-01)", "1) Strategic\n2) Operational\n3) Tactical"))
            put("EE_13", Questions(subject, category,"Fundamentals of Reconnaissance (FM 3-90-2)", "1) Ensure continuous reconnaissance\n2) Do not keep reconnaissance assets in reserve\n3) Orient on the reconnaissance objective\n4) Report information rapidly and accurately\n5) Retain freedom of maneuver\n6) Gain and maintain enemy contact\n7) Develop the situation rapidly"))
            put("EE_14", Questions(subject, category,"Fundamentals of Security (FM 3-90-2)", "1) Provide early and accurate warning\n2) Provide reaction time and maneuver space\n3) Orient on the force or facility to be secured\n4) Perform continuous reconnaissance\n5) Maintain enemy contact"))
            put("EE_15", Questions(subject, category,"Principles of Direct Fire Control (ATP 3-90.1)", "1) Mass the effects of fire\n2) Destroy the greatest threat first\n3) Avoid target overkill\n4) Employ the best weapon for specific targets\n5) Minimize friendly forces exposure\n6) Plan and implement fratricide avoidance measures\n7) Plan for limited visibility conditions\n8) Plan for degraded capabilities"))
            put("EE_16", Questions(subject, category,"Terrain-Based Fire Control Measures", "1) Target Reference Point\n2) Engagement Area\n3) Sector of Fire\n4) Direction of Fire\n5) Terrain-Based Quadrant\n6) Friendly-Based Quadrant\n7) Maximum Engagement Line\n8) Restrictive Fire Line\n9) Final Protective Line"))
            put("EE_17", Questions(subject, category, "Threat-Based Fire Control Measures", "Fire Pattern\nTarget Array\nEngagement Priorities\nWeapon Ready Posture\nEngagement Criteria\nWeapon Control Status\nRules of Engagement\nWeapons Safety Posture\nEngagement Techniques"))
            put("EE_18", Questions(subject, category,"Weapon Control Status", "1) Weapons Hold - Engage only if engaged or ordered to engage\n2) Weapons Tight - Engage only targets positively identified as enemy\n3) Weapons Free - Engage any targets not positively identified as friendly"))
            put("EE_19", Questions(subject, category, "Forms of Maneuver (ADRP 3-90)", "1) Envelopment\n2) Frontal Attack\n3) Infiltration\n4) Penetration\n5) Turning Movement\n* Flank Attack was removed as a form of maneuver in 2020"))
            put("EE_20", Questions(subject, category,"Movement Formations (FM 3-21.10 & FM 3-21.12)", "1) Column\n2) Company Line\n3) Company Wedge\n4) Company Vee\n5) Company File\n6) Echelon Right or Left\n7) Box (weapons company)\n8) Diamond (weapons company)\n9) Coil (stationary weapons company)\n10) Herringbone (weapons company)"))
            put("EE_21", Questions(subject, category, "Movement Techniques (ATP 3-21.10)", "1) Traveling\n2) Traveling Overwatch\n3) Bounding Overwatch\n    a. Alternate\n    b. Successive"))
            put("EE_22", Questions(subject, category,"Tenets of Breaching Operations (ATP 3-21.10)", "1) Intelligence\n2) Fundamental\n3) Organization\n4) Mass\n5) Synchronization"))
            put("EE_23", Questions(subject, category,"Fundamentals of Breaching (ATP 3-21.10)", "1) Suppress\n2) Obscure\n3) Secure\n4) Reduce\n5) Assault"))
            put("EE_24", Questions(subject, category,"Elements of Combat Power (ADRP 3-0)", "1) Leadership\n2) Information\n3) Mission Command\n4) Movement and Maneuver\n5) Intelligence\n6) Fires\n7) Sustainment\n8) Protection"))
            put("EE_25", Questions(subject, category,"Warfighting Functions (ADRP 3-0)", "1) Mission Command\n2) Movement and Maneuver\n3) Intelligence\n4) Fires\n5) Sustainment\n6) Protection"))
            put("EE_26", Questions(subject, category,"Military Aspects of Terrain (ATP 2-01.3)", "1) Obstacles\n2) Avenues of Approach\n3) Key Terrain\n4) Observation and Fields of Fire\n5) Cover and Concealment"))
            put("EE_27", Questions(subject, category,"Five Paragraphs of the Operations Order Format (FM 6-0)", "1) Situation\n2) Mission\n3) Execution\n4) Sustainment\n5) Command and Signal"))
            put("EE_28", Questions(subject, category,"Commander's Critical Information Requirements (ADRP 5-0)", "A commander’s critical information requirement is an information requirement identified by the commander as being critical to facilitating timely decision making.\nThe two key elements are -\n1) Friendly force information requirements (FFIR) - FFIR are information the commander and staff need to understand the status of friendly force and supporting capabilities.\n2) Priority intelligence requirements (PIR) -  PIRs identify the information about the enemy and other aspects of the operational environment that the commander considers most important."))
            put("EE_29", Questions(subject, category,"The Mission Analysis Factors (ATP 3-21.10)", "1) Mission\n2) Enemy\n3) Terrain and Weather\n4) Troops and Support\n5) Time\n6) Civil Considerations"))
            put("EE_30", Questions(subject, category,"Joint operation US military can conduct within the United States", "Defense Support of Civil Authority (DSCA)"))
        }
    }

    private fun loadTacticalTasksAndGraphics(subject: String) {
        val category = "Tactical Mission Tasks, Security Tasks, Operational Graphics"
        with (questionsDeck) {
            put("EE_31", Questions(subject, category, "ic_ambush","Ambush"))
            put("EE_32", Questions(subject, category, "ic_attack_by_fire","Attack by Fire"))
            put("EE_33", Questions(subject, category, "ic_block","Block"))
            put("EE_34", Questions(subject, category, "ic_breach","Breach"))
            put("EE_35", Questions(subject, category, "ic_bypass","Bypass"))
            put("EE_36", Questions(subject, category, "ic_canalize","Canalize"))
            put("EE_37", Questions(subject, category, "ic_clear","Clear"))
            put("EE_38", Questions(subject, category, "ic_contain","Contain"))
            put("EE_39", Questions(subject, category, "ic_control","Control"))
            put("EE_40", Questions(subject, category, "ic_counterattack","Counterattack"))
            put("EE_41", Questions(subject, category, "ic_delay","Delay"))
            put("EE_42", Questions(subject, category, "ic_destroy","Destroy"))
            put("EE_43", Questions(subject, category, "ic_disrupt","Disrupt"))
            put("EE_44", Questions(subject, category, "ic_follow_and_assume","Follow and Assume"))
            put("EE_45", Questions(subject, category, "ic_follow_and_support","Follow and Support"))
            put("EE_46", Questions(subject, category, "ic_fix","Fix"))
            put("EE_47", Questions(subject, category, "ic_interdict","Interdict"))
            put("EE_48", Questions(subject, category, "ic_isolate","Isolate"))
            put("EE_49", Questions(subject, category, "ic_neutralize","Neutralize"))
            put("EE_50", Questions(subject, category, "ic_occupy","Occupy"))
            put("EE_51", Questions(subject, category, "ic_passage_of_lines","Passage of Lines"))
            put("EE_52", Questions(subject, category, "ic_relief_in_place","Relief in Place"))
            put("EE_53", Questions(subject, category, "ic_retain","Retain"))
            put("EE_54", Questions(subject, category, "ic_retirement","Retirement"))
            put("EE_55", Questions(subject, category, "ic_secure","Secure"))
            put("EE_56", Questions(subject, category, "ic_seize","Seize"))
            put("EE_57", Questions(subject, category, "ic_support_by_fire","Support by Fire"))
            put("EE_58", Questions(subject, category, "ic_suppress","Suppress"))
            put("EE_59", Questions(subject, category, "ic_turn","Turn"))
            put("EE_60", Questions(subject, category, "ic_withdraw","Withdraw"))
            put("EE_61", Questions(subject, category, "ic_withdraw_under_pressure","Withdraw Under Pressure"))
            put("EE_62", Questions(subject, category, "ic_obstacle_effect_turn","Obstacle Effect: Turn"))
            put("EE_63", Questions(subject, category, "ic_obstacle_effect_block","Obstacle Effect: Block"))
            put("EE_64", Questions(subject, category, "ic_obstacle_effect_disrupt","Obstacle Effect: Disrupt"))
            put("EE_65", Questions(subject, category, "ic_obstacle_effect_fix","Obstacle Effect: Fix"))
            put("EE_66", Questions(subject, category,"Ambush", "An attack by fire or other destructive means from concealed positions on a moving or temporarily halted enemy. (FM 3-90-1)"))
            put("EE_67", Questions(subject, category,"Attack by Fire", "A tactical mission task in which a commander uses direct fires, supported by indirect fires, to engage an enemy force without closing with the enemy to destroy, suppress, fix, or deceive that enemy. (FM 3-90-1)"))
            put("EE_68", Questions(subject, category,"Block", "A tactical mission task that denies the enemy access to an area or prevents his advance in a direction or along an avenue of approach"))
            put("EE_69", Questions(subject, category,"Breach", "A tactical mission task in which the unit employs all available means to break through or establish a passage through an enemy defense, obstacle, minefield, or fortification. (FM 3-90-1)"))
            put("EE_70", Questions(subject, category,"Bypass", "A tactical mission task in which the commander directs his unit to maneuver around an obstacle, position, or enemy force to maintain the momentum of the operation while deliberately avoiding combat with an enemy force. (FM 3-90-1)"))
            put("EE_71", Questions(subject, category,"Canalize", "A tactical mission task in which the commander restricts enemy movement to a narrow zone by exploiting terrain coupled with the use of obstacles, fires, or friendly maneuver. (FM 3-90-1)"))
            put("EE_72", Questions(subject, category,"Clear", "A tactical mission task that requires the commander to remove all enemy forces and eliminate organized resistance within an assigned area. (FM 3-90-1)"))
            put("EE_73", Questions(subject, category,"Contain", "A tactical mission task that requires the commander to stop, hold, or surround enemy forces or to cause them to center their activity on a given front and prevent them from withdrawing any part of their forces for use elsewhere. (FM 3-90-1)"))
            put("EE_74", Questions(subject, category,"Control", "A tactical mission task that requires the commander to maintain physical influence over a specified area to prevent its use by an enemy or to create conditions necessary for successful friendly operations. (FM 3-90-1)"))
            put("EE_75", Questions(subject, category,"Counterattack", "Attack by part or all of a defending force against an enemy attacking force, for such specific purposes as regaining ground lost, or cutting off or destroying enemy advance units, and with the general objective of denying to the enemy the attainment of the enemy’s purpose in attacking."))
            put("EE_76", Questions(subject, category,"Delay", "To slow the time of arrival of enemy forces or capabilities or alter the ability of the enemy or adversary to project forces or capabilities. (FM 3-09)"))
            put("EE_77", Questions(subject, category,"Destroy", "A tactical mission task that physically renders an enemy force combat-ineffective until it is reconstituted. Alternatively, to destroy a combat system is to damage it so badly that it cannot perform any function or be restored to a usable condition without being entirely rebuilt. (FM 3-90-1)"))
            put("EE_78", Questions(subject, category,"Disrupt", "A tactical mission task in which a commander integrates direct and indirect fires, terrain, and obstacles to upset an enemy’s formation or tempo, interrupt his timetable, or cause enemy forces to commit prematurely or attack in piecemeal fashion."))
            put("EE_79", Questions(subject, category,"Follow and Assume", "A tactical mission task in which a second committed force follows a force conducting an offensive task and is prepared to continue the mission if the lead force is fixed, attrited, or unable to continue. (FM 3-90-1)"))
            put("EE_80", Questions(subject, category,"Follow and Support", "A tactical mission task in which a committed force follows and supports a lead force conducting an offensive task. (FM 3-90-1)"))
            put("EE_81", Questions(subject, category,"Fix", "A tactical mission task where a commander prevents the enemy from moving any part of his force from a specific location for a specific period. Fix is also an obstacle effect that focuses fire planning and obstacle effort to slow an attacker’s movement within a specified area, normally an engagement areas. (FM 3-90-1)"))
            put("EE_82", Questions(subject, category,"Interdict", "A tactical mission task where the commander prevents, disrupts, or delays the enemy’s use of an area or route. (FM 3-90-1)"))
            put("EE_83", Questions(subject, category,"Isolate", "A tactical mission task that requires a unit to seal off—both physically and psychologically—an enemy from sources of support, deny the enemy freedom of movement, and prevent the isolated enemy force from having contact with other enemy forces. (FM 3-90-1)"))
            put("EE_84", Questions(subject, category,"Neutralize", "A tactical mission task that results in rendering enemy personnel or materiel incapable of interfering with a particular operation. (FM 3-90-1)"))
            put("EE_85", Questions(subject, category,"Occupy", "A tactical mission task that involves a force moving a friendly force into an area so that it can control that area. Both the force’s movement to and occupation of the area occur without enemy opposition. (FM 3-90-1)"))
            put("EE_86", Questions(subject, category,"Passage of Lines", "An operation in which a force moves forward or rearward through another force’s combat positions with the intention of moving into or out of contact with the enemy. (JP 3-18)"))
            put("EE_87", Questions(subject, category,"Relief in Place", "An operation in which, by direction of higher authority, all or part of a unit is replaced in an area by the incoming unit and the responsibilities of the replaced elements for the mission and the assigned zone of operations are transferred to the incoming unit. (JP 3-07.3)"))
            put("EE_88", Questions(subject, category,"Retain", "A tactical mission task in which the commander ensures that a terrain feature controlled by a friendly force remains free of enemy occupation or use. (FM 3-90-1)"))
            put("EE_89", Questions(subject, category,"Retirement", "A form of retrograde in which a force out of contact moves away from the enemy. (ADRP 3-90)"))
            put("EE_90", Questions(subject, category,"Secure", "A tactical mission task that involves preventing a unit, facility, or geographical location from being damaged or destroyed as a result of enemy action. (FM 3-90-1)"))
            put("EE_91", Questions(subject, category,"Seize", "A tactical mission task that involves taking possession of a designated area using overwhelming force. (FM 3-90-1)"))
            put("EE_92", Questions(subject, category,"Support by Fire", "A tactical mission task in which a maneuver force moves to a position where it can engage the enemy by direct fire in support of another maneuvering force. (FM 3-90-1)"))
            put("EE_93", Questions(subject, category,"Suppress", "A tactical mission task that results in temporary degradation of the performance of a force or weapons system below the level needed to accomplish the mission. (FM 3-90-1)"))
            put("EE_94", Questions(subject, category,"Turn", "A tactical mission task that involves forcing an enemy force from one avenue of approach or mobility corridor to another"))
            put("EE_95", Questions(subject, category,"Withdraw", "A planned retrograde operation in which a force in contact disengages from an enemy force and moves in a direction away from the enemy. (JP 3-17)"))
            put("EE_96", Questions(subject, category,"Withdraw Under Pressure", "A planned retrograde operation in which a force in contact disengages from an enemy force and moves in a direction away from the enemy. (JP 3-17)"))
            put("EE_97", Questions(subject, category,"Obstacle Effect: Turn", "A tactical obstacle effect that integrates fire planning and obstacle effort to divert an enemy formation from one avenue of approach to an adjacent avenue of approach or into an engagement area."))
            put("EE_98", Questions(subject, category,"Obstacle Effect: Block", "An obstacle effect that integrates fire planning and obstacle effort to stop an attacker along a specific avenue of approach or to prevent the attacking force from passing through an engagement area."))
            put("EE_99", Questions(subject, category,"Obstacle Effect: Disrupt", "An obstacle effect that focuses fire planning and obstacle effort to cause the enemy to break up his formation and tempo, interrupt his timetable, commit breaching assets prematurely, and attack in a piecemeal effort."))
            put("EE_100", Questions( subject, category,"Obstacle Effect: Fix", "An obstacle effect that focuses fire planning and obstacle effort to slow an attacker’s movement within a specified area, normally an engagement area."))
            put("EE_101", Questions(subject, category, "ic_contact_point", "Contact Point"))
            put("EE_102", Questions(subject, category, "ic_linkup_point", "Linkup Point"))
            put("EE_103", Questions(subject, category, "ic_final_protective_fire","Final Protective Fire (FPF)"))
            put("EE_104", Questions(subject, category, "ic_line_of_departure","Line of Departure"))
            put("EE_105", Questions(subject, category, "ic_phase_line","Phase Line"))
            put("EE_106", Questions(subject, category, "ic_checkpoint","Checkpoint (CP)"))
            put("EE_107", Questions(subject, category, "ic_target_reference_point","Target Reference Point (TRP)"))
            put("EE_108", Questions(subject, category, "ic_point_target","Point Target"))
            put("EE_109", Questions(subject, category, "ic_lane","Lane"))
            put("EE_110", Questions(subject, category, "Contact Point","In land warfare, a point on the terrain, easily identifiable, where two or more units are required to make contact. Also called CP."))
            put("EE_111", Questions(subject, category, "Linkup Point","The point where two infiltrating elements in the same or different infiltration lanes are scheduled to meet to consolidate before proceeding on with their missions."))
            put("EE_112", Questions(subject, category, "Final Protective Fire (FPF)","An immediately available prearranged barrier of fire designed to impede enemy movement across defensive lines or areas."))
            put("EE_113", Questions(subject, category, "Line of Departure","A phase line crossed at a prescribed time by troops initiating an offensive operation. Also called LD."))
            put("EE_114", Questions(subject, category, "Phase Line","Line utilized for control and coordination of military operations, usually an easily identified feature in the operational area. Also called PL."))
            put("EE_115", Questions(subject, category, "Checkpoint (CP)","A predetermined point on the ground used to control movement, tactical maneuver, and orientation. Also called CP."))
            put("EE_116", Questions(subject, category, "Target Reference Point (TRP)","A predetermined point of reference, normally a permanent structure or terrain feature that can be used when describing a target location. Also called TRP."))
            put("EE_117", Questions(subject, category, "Point Target","An area designated and numbered for future firing"))
            put("EE_118", Questions(subject, category, "Lane","A route through, over, or around an enemy or friendly obstacle that provides passage of a force. (ATP 3-90.4)"))
            put("EE_119", Questions(subject, category, "ic_screen","Screen"))
            put("EE_120", Questions(subject, category, "ic_guard","Guard"))
            put("EE_121", Questions(subject, category, "ic_cover","Cover"))
            put("EE_122", Questions(subject, category, "Screen","A security task that primarily provides early warning to the protected force. (ADRP 3-90)"))
            put("EE_123", Questions(subject, category, "Guard","A security task to protect the main force by fighting to gain time while also observing and reporting information and preventing enemy ground observation of and direct fire against the main body. Units conducting a guard mission cannot operate independently because they rely upon fires and functional and multifunctional support assets of the main body. (ADRP 3-90)"))
            put("EE_124", Questions(subject, category, "Cover","A security task to protect the main body by fighting to gain time while also observing and reporting information and preventing enemy ground observation of and direct fire against the main body. (ADRP 3-90)"))
        }
    }

    private fun loadUsWeaponSystems(subject: String) {
        val category = "US Weapon Systems"
        with (questionsDeck) {
            put("EE_125", Questions(subject, category, "ic_m4a1","M4A1"))
            put("EE_126", Questions(subject, category, "M4A1 - Size of Round","5.56 mm"))
            put("EE_127", Questions(subject, category, "M4A1 - Max Effective Range (point/area)","Point - 500 m\nArea - 600 m"))
            put("EE_128", Questions(subject, category, "M4A1 - Symbol","ic_symbol_m4a1"))
            put("EE_129", Questions(subject, category, "ic_m320","M320"))
            put("EE_130", Questions(subject, category, "M320 - Size of Round","40 mm"))
            put("EE_131", Questions(subject, category, "M320 - Max Effective Range","400 m"))
            put("EE_132", Questions(subject, category, "M320 - Symbol","ic_symbol_m320"))
            put("EE_133", Questions(subject, category, "ic_m249","M249"))
            put("EE_134", Questions(subject, category, "M249 - Size of Round","5.56 mm"))
            put("EE_135", Questions(subject, category, "M249 - Max Effective Range (Bi pt, Bi ar, Tri pt, Tri ar)","Bipod Point - 600 m\nBipod Area - 800 m\nTripod Point - 800 m\nTripod Area - 1000 m"))
            put("EE_136", Questions(subject, category, "M249 Symbol","ic_symbol_m249"))
            put("EE_137", Questions(subject, category, "ic_m240","M240"))
            put("EE_138", Questions(subject, category, "M240 - Size of Round","7.62 mm"))
            put("EE_139", Questions(subject, category, "M240 - Max Effective Range (Bi pt, Bi ar, Tri pt, Tri ar)","Bipod Point - 600 m\nBipod Area - 800 m\nTripod Point - 800 m\nTripod Area - 1800 m"))
            put("EE_140", Questions(subject, category, "M240 - Crew","3 PAX\n- Gunner\n- AG\n- AB"))
            put("EE_141", Questions(subject, category, "M240 - Symbol","ic_symbol_m240"))
            put("EE_142", Questions(subject, category, "ic_m2","M2"))
            put("EE_143", Questions(subject, category, "M2 - Size of Round",".50 CAL"))
            put("EE_144", Questions(subject, category, "M2 - Max Effective Range","1,829 m"))
            put("EE_145", Questions(subject, category, "M2 - Crew","4 PAX\n-Crew Leader\n- AG\n- Gunner\n- AB"))
            put("EE_146", Questions(subject, category, "M2 - Symbol","ic_symbol_m2"))
            put("EE_147", Questions(subject, category, "ic_mk19","MK19"))
            put("EE_148", Questions(subject, category, "MK19 - Size of Round","40 mm"))
            put("EE_149", Questions(subject, category, "MK19 - Max Effective Range (pt/ar)","Point - 1,500 m\nArea - 2,212 m"))
            put("EE_150", Questions(subject, category, "MK19 - Crew","3 PAX\n- Gunner\n- AG\n- AB"))
            put("EE_151", Questions(subject, category, "MK19 - Symbol","ic_symbol_mk19"))
            put("EE_152", Questions(subject, category, "ic_m777","M777 Howitzer"))
            put("EE_153", Questions(subject, category, "M777 Howitzer - Size of Round","155 m"))
            put("EE_154", Questions(subject, category, "M777 Howitzer - Max Effective Range (HE, RAP, EXCAL)","HE - 22.2-22.5 km\nRAP - 30 km\nEXCAL - 37.5 km"))
            put("EE_155", Questions(subject, category, "M777 Howitzer - Crew","7+1"))
            put("EE_156", Questions(subject, category, "M777 Howitzer - Symbol","ic_symbol_m777"))
            put("EE_157", Questions(subject, category, "ic_m119","M119 Howitzer"))
            put("EE_158", Questions(subject, category, "M119 Howitzer - Size of Round","105 mm"))
            put("EE_159", Questions(subject, category, "M119 Howitzer - Max Effective Range (HE, DPICM, RAP)","HE - 11.5 km\nDPICM - 14.1 km\nRAP - 19.5 km"))
            put("EE_160", Questions(subject, category, "M119 Howitzer - Crew","7"))
            put("EE_161", Questions(subject, category, "M119 Howitzer - Symbol","ic_symbol_m119"))
            put("EE_162", Questions(subject, category, "ic_m107","M107 Rifle"))
            put("EE_163", Questions(subject, category, "M107 Rifle - Size of Round",".50 CAL"))
            put("EE_164", Questions(subject, category, "M107 Rifle - Max Effective Range","1,830 m"))
            put("EE_165", Questions(subject, category, "M107 Rifle - Symbol","ic_symbol_m107"))
            put("EE_166", Questions(subject, category, "ic_at4","M136 AT4"))
            put("EE_167", Questions(subject, category, "M136 AT4 - Size of Round","84 mm"))
            put("EE_168", Questions(subject, category, "M136 AT4 - Max Effective Range","300 m"))
            put("EE_169", Questions(subject, category, "M136 AT4 - Symbol","ic_symbol_at4"))
            put("EE_170", Questions(subject, category, "ic_itas_tow","ITAS/TOW"))
            put("EE_171", Questions(subject, category, "ITAS/TOW - Size of Round","6 in"))
            put("EE_172", Questions(subject, category, "ITAS/TOW - Max Effective Range","3,750 - 4,500 m"))
            put("EE_173", Questions(subject, category, "ITAS/TOW - Symbol","ic_symbol_itas_tow"))
            put("EE_174", Questions(subject, category, "ic_javelin","M98A2 Javelin"))
            put("EE_175", Questions(subject, category, "M98A2 Javelin - Size of Round","127 mm (5 in)"))
            put("EE_176", Questions(subject, category, "M98A2 Javelin - Max Effective Range","2,500 m (65 m arming range)"))
            put("EE_177", Questions(subject, category, "M98A2 Javelin - Crew","1-2"))
            put("EE_178", Questions(subject, category, "M98A2 Javelin - Symbol","ic_symbol_javelin"))
            put("EE_179", Questions(subject, category, "ic_m1a2","M1A2 Abrams"))
            put("EE_180", Questions(subject, category, "M1A2 - Size of Rounds","120 mm\n.50 CAL\n7.62 mm"))
            put("EE_181", Questions(subject, category, "M1A2 - Max Effective Ranges","120 mm - 3,000 m\n.50 CAL - 1,600 m\n7.62 mm COAX - 900 m"))
            put("EE_182", Questions(subject, category, "M1A2 - Crew","4 PAX\n- CDR\n- Gunner\n- Loader\n- Driver"))
            put("EE_183", Questions(subject, category, "M1A2 - Symbol","ic_symbol_m1a2"))
            put("EE_184", Questions(subject, category, "ic_bradley","M2 Bradley"))
            put("EE_185", Questions(subject, category, "M2 Bradley - Size of Rounds","25 mm Bushmaster Chain Gun\nTOW-ITAS (6 in)\nCOAX (7.62 mm)"))
            put("EE_186", Questions(subject, category, "M2 Bradley - Max Effective Ranges","25 mm - 2,000m\nTOW-ITAS - 3,750-4,500m\nCOAX (7.62 mm) - 900m"))
            put("EE_187", Questions(subject, category, "M2 Bradley - Crew","3 PAX\n- CDR\n- Gunner\n- Driver"))
            put("EE_188", Questions(subject, category, "M2 Bradley - Symbol","ic_symbol_bradley"))
            put("EE_189", Questions(subject, category, "ic_m120","M120 Mortar"))
            put("EE_190", Questions(subject, category, "M120 Mortar - Size of Round","120 mm"))
            put("EE_191", Questions(subject, category, "M120 Mortar - Max Effective Range","7,200 m (170 m min)"))
            put("EE_192", Questions(subject, category, "M120 Mortar - Crew","5 PAX\n- SL\n- Gunner\n- AG\n- AB 1\n- AB 2"))
            put("EE_193", Questions(subject, category, "M120 Mortar - Symbol","ic_symbol_m120"))
            put("EE_194", Questions(subject, category, "ic_paladin","M109A6 Paladin"))
            put("EE_195", Questions(subject, category, "M109A6 Paladin - Size of Round","155 mm"))
            put("EE_196", Questions(subject, category, "M109A6 Paladin - Max Effective Range (HE, DPICM, RAP)","HE - 18.2-21 km\nDPICM - 17.9-28.1 km\nRAP - 30 km"))
            put("EE_197", Questions(subject, category, "M109A6 Paladin - Crew","4 PAX\n- CDR\n- Gunner\n- Loader\n- Driver"))
            put("EE_198", Questions(subject, category, "M109A6 Paladin - Symbol","ic_symbol_paladin"))
            put("EE_199", Questions(subject, category, "ic_m252","M252 Mortar"))
            put("EE_200", Questions(subject, category, "M252 Mortar - Size of Round","81 mm"))
            put("EE_201", Questions(subject, category, "M252 Mortar - Max Effective Range","5,800 m (80 m min)"))
            put("EE_202", Questions(subject, category, "M252 Mortar - Crew","5 PAX\n- SL\n- Gunner\n- AG\n- AB 1\n- AB 2"))
            put("EE_203", Questions(subject, category, "M252 Mortar - Symbol","ic_symbol_m252"))
            put("EE_204", Questions(subject, category, "ic_m224","M224 Mortar"))
            put("EE_205", Questions(subject, category, "M224 Mortar - Size of Round","60 mm"))
            put("EE_206", Questions(subject, category, "M224 Mortar - Max Effective Range","3,489 m (70 m min)"))
            put("EE_207", Questions(subject, category, "M224 Mortar - Crew","3 PAX\n- SL\n- Gunner\n- AB"))
            put("EE_208", Questions(subject, category, "M224 Mortar - Symbol","ic_symbol_m224"))
            put("EE_209", Questions(subject, category, "ic_stryker","M1126 Stryker"))
            put("EE_210", Questions(subject, category, "M1126 Stryker - Size of Rounds",".50 CAL\n40 mm\n7.62 mm"))
            put("EE_211", Questions(subject, category, "M1126 Stryker - Max Effective Ranges",".50 CAL - 1,829 m\n40 mm - 1,500-2,212 m\n7.62 mm - 900m"))
            put("EE_212", Questions(subject, category, "M1126 Stryker - Crew","2+9\n- CDR\n- Driver\n- 9 Dismounts"))
            put("EE_213", Questions(subject, category, "M1126 Stryker - Symbol","ic_symbol_stryker"))
            put("EE_214", Questions(subject, category, "ic_stryker_mgs","M1128 Stryker Mobile Gun System (MGS)"))
            put("EE_215", Questions(subject, category, "M1128 Stryker Mobile Gun System (MGS) - Size of Round","105 mm"))
            put("EE_216", Questions(subject, category, "M1128 Stryker Mobile Gun System (MGS) - Max Effective Range","500 - 3,500 m (depending on round)"))
            put("EE_217", Questions(subject, category, "M1128 Stryker Mobile Gun System (MGS) - Crew","3 PAX\n- CDR\n- Gunner\n- Driver"))
            put("EE_218", Questions(subject, category, "M1128 Stryker Mobile Gun System (MGS) - Symbol","ic_symbol_stryker_mgs"))
            put("EE_219", Questions(subject, category, "ic_hmmwv","HMMWV"))
            put("EE_220", Questions(subject, category, "HMMWV - Mobility Range","500 km"))
            put("EE_221", Questions(subject, category, "HMMWV - Crew","2-5 PAX"))
            put("EE_222", Questions(subject, category, "HMMWV - Symbol","ic_symbol_hmmwv"))
            put("EE_223", Questions(subject, category, "ic_m113","M113"))
            put("EE_224", Questions(subject, category, "M113 - Size of Round",".50 CAL"))
            put("EE_225", Questions(subject, category, "M113 - Max Effective Range","1,830 m"))
            put("EE_226", Questions(subject, category, "M113 - Crew","2+8"))
            put("EE_227", Questions(subject, category, "M113 - Symbol","ic_symbol_m113"))
            put("EE_228", Questions(subject, category, "ic_abv","M1 Assault Breacher Vehicle (ABV)"))
            put("EE_229", Questions(subject, category, "M1 Assault Breacher Vehicle (ABV) - Size of Rounds",".50 CAL\nM58 MICLIC (Mine Clearing Line Charge)"))
            put("EE_230", Questions(subject, category, "M1 Assault Breacher Vehicle (ABV) - Max Effective Range",".50 CAL - 1,829 m\nMICLIC - 62 ft x 295 ft lane"))
            put("EE_231", Questions(subject, category, "M1 Assault Breacher Vehicle (ABV) - Crew","2 PAX"))
            put("EE_232", Questions(subject, category, "M1 Assault Breacher Vehicle (ABV) - Symbol","ic_symbol_abv"))
            put("EE_233", Questions(subject, category, "ic_ace","M9 Armored Combat Earthmover (ACE)"))
            put("EE_234", Questions(subject, category, "M9 Armored Combat Earthmover (ACE) - Round","Smoke"))
            put("EE_235", Questions(subject, category, "M9 Armored Combat Earthmover (ACE) - Mobility Range","350 km"))
            put("EE_236", Questions(subject, category, "M9 Armored Combat Earthmover (ACE) - Crew","1 PAX"))
            put("EE_237", Questions(subject, category, "M9 Armored Combat Earthmover (ACE) - Symbol","ic_symbol_ace"))
            put("EE_238", Questions(subject, category, "ic_avenger","Avenger"))
            put("EE_239", Questions(subject, category, "Avenger - Size of Round","8x Stinger Missiles per vic"))
            put("EE_240", Questions(subject, category, "Avenger - Max Effective Ranges","Range - 5 km\nAltitude - 10,000 ft"))
            put("EE_241", Questions(subject, category, "Avenger - Crew","2 PAX"))
            put("EE_242", Questions(subject, category, "Avenger - Symbol","ic_symbol_avenger"))
            put("EE_243", Questions(subject, category, "ic_ah64","AH64 Apache Helicopter"))
            put("EE_244", Questions(subject, category, "AH64 Apache Helicopter - Size of Rounds","30 mm Chain Gun\n70 mm Rockets\nHellfire"))
            put("EE_245", Questions(subject, category, "AH64 Apache Helicopter - Max Effective Ranges","30 mm Chain Gun - 1,700 m\n70 mm Rockets - 7,000 m\nHellfire - 500-8,000 m"))
            put("EE_246", Questions(subject, category, "AH64 Apache Helicopter - Crew","2 PAX"))
            put("EE_247", Questions(subject, category, "AH64 Apache Helicopter - Symbol","ic_symbol_ah64"))
            put("EE_248", Questions(subject, category, "ic_maaws","M3/M4 MAAWS (Carl Gustaf)"))
            put("EE_249", Questions(subject, category, "M3/M4 MAAWS (Carl Gustaf) - Size of Round","84 mm"))
            put("EE_250", Questions(subject, category, "M3/M4 MAAWS (Carl Gustaf) - Max Effective Range","150-1,000m (based on round)"))
            put("EE_251", Questions(subject, category, "M3/M4 MAAWS (Carl Gustaf) - Crew","2 PAX\n- Gunner\n- Loader"))
            put("EE_252", Questions(subject, category, "M3/M4 MAAWS (Carl Gustaf) - Symbol","ic_symbol_maaws"))
            put("EE_253", Questions(subject, category, "ic_m110","M110 Semi Automatic Sniper System (SASS)"))
            put("EE_254", Questions(subject, category, "M110 Semi Automatic Sniper System (SASS) - Size of Round","7.62 mm"))
            put("EE_255", Questions(subject, category, "M110 Semi Automatic Sniper System (SASS) - Max Effective Range","1,000 m"))
            put("EE_256", Questions(subject, category, "M110 Semi Automatic Sniper System (SASS) - Crew","2 PAX"))
            put("EE_257", Questions(subject, category, "M110 Semi Automatic Sniper System (SASS) - Symbol","ic_symbol_m110"))
            put("EE_258", Questions(subject, category, "ic_wolverine","M104 Wolverine"))
            put("EE_259", Questions(subject, category, "M104 Wolverine - Bridge/Mobility Range","79 ft bridge gap / 400 km mobility"))
            put("EE_260", Questions(subject, category, "M104 Wolverine - Crew","2 PAX"))
            put("EE_261", Questions(subject, category, "M104 Wolverine - Symbol","ic_symbol_wolverine"))
        }
    }

    private fun loadThreatWeaponSystems(subject: String) {
        val category = "Threat Weapon System"
        with (questionsDeck) {
            put("EE_262", Questions(subject, category, "ic_ak47","AK-47"))
            put("EE_263", Questions(subject, category, "AK-47 - Size of Round","7.62 mm"))
            put("EE_264", Questions(subject, category, "AK-47 - Max Effective Range","350 m"))
            put("EE_265", Questions(subject, category, "AK-47 - Symbol","ic_symbol_ak47"))
            put("EE_266", Questions(subject, category, "ic_ak74","AK-74"))
            put("EE_267", Questions(subject, category, "AK-74 - Size of Round","5.45 mm"))
            put("EE_268", Questions(subject, category, "AK-74 - Max Effective Range","500 m"))
            put("EE_269", Questions(subject, category, "AK-74 - Symbol","ic_symbol_ak74"))
            put("EE_270", Questions(subject, category, "ic_svd","SVD"))
            put("EE_271", Questions(subject, category, "SVD - Size of Round","7.62 mm"))
            put("EE_272", Questions(subject, category, "SVD - Max Effective Range","800 m"))
            put("EE_273", Questions(subject, category, "SVD - Symbol","ic_symbol_svd"))
            put("EE_274", Questions(subject, category, "ic_rpk","RPK"))
            put("EE_275", Questions(subject, category, "RPK - Size of Round","7.62 mm"))
            put("EE_276", Questions(subject, category, "RPK - Max Effective Range","1,000 m"))
            put("EE_277", Questions(subject, category, "RPK - Symbol","ic_symbol_rpk"))
            put("EE_278", Questions(subject, category, "ic_rpk74","RPK-74"))
            put("EE_279", Questions(subject, category, "RPK-74 - Size of Round","5.45 mm"))
            put("EE_280", Questions(subject, category, "RPK-74 - Max Effective Range","800 m"))
            put("EE_281", Questions(subject, category, "RPK-74 - Symbol","ic_symbol_rpk74"))
            put("EE_282", Questions(subject, category, "ic_PKM","PKM"))
            put("EE_283", Questions(subject, category, "PKM - Size of Round","7.62 mm"))
            put("EE_284", Questions(subject, category, "PKM - Max Effective Range","1,000 m"))
            put("EE_285", Questions(subject, category, "PKM - Crew","2 PAX"))
            put("EE_286", Questions(subject, category, "PKM - Symbol","ic_symbol_pkm"))
            put("EE_287", Questions(subject, category, "ic_rpg","RPG-7"))
            put("EE_288", Questions(subject, category, "RPG-7 - Size of Round","40 mm"))
            put("EE_289", Questions(subject, category, "RPG-7 - Max Effective Range (point/area)","Point - 300 m\nArea - 500 m"))
            put("EE_290", Questions(subject, category, "RPG-7 - Crew","2 PAX"))
            put("EE_291", Questions(subject, category, "RPG-7 - Symbol","ic_symbol_rpg"))
            put("EE_292", Questions(subject, category, "ic_rpg29","RPG-29"))
            put("EE_293", Questions(subject, category, "RPG-29 - Size of Round","105 mm"))
            put("EE_294", Questions(subject, category, "RPG-29 - Max Effective Range","500 m (800 m with tripod and fire control unit)"))
            put("EE_295", Questions(subject, category, "RPG-29 - Crew","2 PAX"))
            put("EE_296", Questions(subject, category, "RPG-29 - Symbol","ic_symbol_rpg29"))
            put("EE_297", Questions(subject, category, "ic_ags17","AGS-17 Plamya"))
            put("EE_298", Questions(subject, category, "AGS-17 Plamya - Size of Round","30 mm"))
            put("EE_299", Questions(subject, category, "AGS-17 Plamya - Max Effective Range","1,700 m"))
            put("EE_300", Questions(subject, category, "AGS-17 Plamya - Crew","3 PAX"))
            put("EE_301", Questions(subject, category, "AGS-17 Plamya - Symbol","ic_symbol_ags17"))
            put("EE_302", Questions(subject, category, "ic_w87","W-87"))
            put("EE_303", Questions(subject, category, "W-87 - Size of Round","35 mm"))
            put("EE_304", Questions(subject, category, "W-87 - Max Effective Range","600 m"))
            put("EE_305", Questions(subject, category, "W-87 - Crew","3 PAX"))
            put("EE_306", Questions(subject, category, "W-87 - Symbol","ic_symbol_w87"))
            put("EE_307", Questions(subject, category, "ic_panzerfaust","Panzerfaust 3"))
            put("EE_308", Questions(subject, category, "Panzerfaust 3 - Size of Round","60 mm"))
            put("EE_309", Questions(subject, category, "Panzerfaust 3 - Max Effective Range","600 m"))
            put("EE_310", Questions(subject, category, "Panzerfaust 3 - Crew","2 PAX"))
            put("EE_311", Questions(subject, category, "Panzerfaust 3 - Symbol","ic_symbol_panzerfaust"))
            put("EE_312", Questions(subject, category, "ic_t54","T-54/55"))
            put("EE_313", Questions(subject, category, "T-54/55 - Size of Rounds","100 mm AT Gun\n12.7 mm\n7.62 COAX"))
            put("EE_314", Questions(subject, category, "T-54/55 - Max Effective Ranges","100 mm Cannon - 2,000 m\n12.7 mm - 1,600 m\n7.62 COAX - 800 m"))
            put("EE_315", Questions(subject, category, "T-54/55 - Crew","4 PAX"))
            put("EE_316", Questions(subject, category, "T-54/55 - Symbol","ic_symbol_t54"))
            put("EE_317", Questions(subject, category, "ic_t62","T-62"))
            put("EE_318", Questions(subject, category, "T-62 - Size of Rounds","115 mm Tank Gun\n7.62 COAX"))
            put("EE_319", Questions(subject, category, "T-62 - Max Effective Ranges","115 mm Tank Gun - 2,000 m\n7.62 COAX - 800 m"))
            put("EE_320", Questions(subject, category, "T-62 - Crew","4 PAX"))
            put("EE_321", Questions(subject, category, "T-62 - Symbol","ic_symbol_t62"))
            put("EE_322", Questions(subject, category, "ic_t72","T-72A"))
            put("EE_323", Questions(subject, category, "T-72A - Size of Rounds","125 mm Tank Gun\n12.7 mm MG\n7.62 COAX"))
            put("EE_324", Questions(subject, category, "T-72A - Max Effective Ranges","125 mm Tank Gun - 3,000 m\n12.7 mm MG - 2,000 m\n7.62 COAX - 1,000 m"))
            put("EE_325", Questions(subject, category, "T-72A - Crew","3 PAX"))
            put("EE_326", Questions(subject, category, "T-72A - Symbol","ic_symbol_t72"))
            put("EE_327", Questions(subject, category, "ic_t80","T-80B"))
            put("EE_328", Questions(subject, category, "T-80B - Size of Rounds","125mm Tank Gun\n12.7mm MG\n7.62 COAX"))
            put("EE_329", Questions(subject, category, "T-80B - Max Effective Ranges","125mm Tank Gun - 3,000 m\n12.7mm MG - 2,000 m\n7.62 COAX - 1,000 m"))
            put("EE_330", Questions(subject, category, "T-80B - Crew","3 PAX"))
            put("EE_331", Questions(subject, category, "T-80B - Symbol","ic_symbol_t80"))
            put("EE_332", Questions(subject, category, "ic_t90","T-90A"))
            put("EE_333", Questions(subject, category, "T-90A - Size of Round","125mm Tank Gun\n12.7mm MG\n7.62 COAX"))
            put("EE_334", Questions(subject, category, "T-90A - Max Effective Ranges","125mm Tank Gun - 3,000 m\n12.7mm MG - 2,000 m\n7.62 COAX - 1,500 m"))
            put("EE_335", Questions(subject, category, "T-90A - Crew","3 PAX"))
            put("EE_336", Questions(subject, category, "T-90A - Symbol","ic_symbol_t90"))
            put("EE_337", Questions(subject, category, "ic_bmp1","BMP-1"))
            put("EE_338", Questions(subject, category, "BMP-1 - Size of Rounds","73 mm Gun\nATGM\n7.62mm COAX"))
            put("EE_339", Questions(subject, category, "BMP-1 - Max Effective Ranges","73 mm Gun - 1,300 m\nATGM - 3,000 m\n7.62mm COAX - 1,000 m"))
            put("EE_340", Questions(subject, category, "BMP-1 - Crew","3 PAX + 8 Dismounts"))
            put("EE_341", Questions(subject, category, "BMP-1 - Symbol","ic_symbol_bmp1"))
            put("EE_342", Questions(subject, category, "ic_bmp2","BMP-2"))
            put("EE_343", Questions(subject, category, "BMP-2 - Size of Rounds","30 mm\nAT-5 ATGM\n7.62mm COAX"))
            put("EE_344", Questions(subject, category, "BMP-2 - Max Effective Ranges","30 mm - 2,000 m\nAT-5 ATGM - 4,000 m\n7.62mm COAX - 1,500m"))
            put("EE_345", Questions(subject, category, "BMP-2 - Crew","3 PAX + 7 Dismounts"))
            put("EE_346", Questions(subject, category, "BMP-2 - Symbol","ic_symbol_bmp2"))
            put("EE_347", Questions(subject, category, "ic_bmp3","BMP-3 UAE"))
            put("EE_348", Questions(subject, category, "BMP-3 UAE - Size of Rounds","100 mm Cannon\nAT-10 ATGM\n30 mm Chain Gun\n7.62 mm COAX"))
            put("EE_349", Questions(subject, category, "BMP-3 UAE - Max Effective Ranges","100 mm Cannon - 4,000 m\nAT-10 ATGM - 4,000 m\n30 mm Chain Gun - 2,000 m\n7.62 mm COAX - 1,500 m"))
            put("EE_350", Questions(subject, category, "BMP-3 UAE - Crew","3 PAX + 7 Dismounts"))
            put("EE_351", Questions(subject, category, "BMP-3 UAE - Symbol","ic_symbol_bmp3"))
            put("EE_352", Questions(subject, category, "ic_brdm2","BRDM-2"))
            put("EE_353", Questions(subject, category, "BRDM-2 - Size of Rounds ","14.5 mm MG\n7.62 mm COAX"))
            put("EE_354", Questions(subject, category, "BRDM-2 - Max Effective Ranges","14.5 mm MG - 3,000 m\n7.62 mm COAX - 1,000 m"))
            put("EE_355", Questions(subject, category, "BRDM-2 - Crew","4 PAX"))
            put("EE_356", Questions(subject, category, "BRDM-2 - Symbol","ic_symbol_brdm2"))
            put("EE_357", Questions(subject, category, "ic_btr80","BTR-80"))
            put("EE_358", Questions(subject, category, "BTR-80 - Size of Rounds","14.5 mm MG\n7.62 mm COAX"))
            put("EE_359", Questions(subject, category, "BTR-80 - Max Effective Ranges","14.5 mm MG - 3,000 m\n7.62 mm COAX - 1,000 m"))
            put("EE_360", Questions(subject, category, "BTR-80 - Crew","3 PAX + 7 Dismounts"))
            put("EE_361", Questions(subject, category, "BTR-80 - Symbol","ic_symbol_btr80"))
            put("EE_362", Questions(subject, category, "ic_mi24","Mi-24"))
            put("EE_363", Questions(subject, category, "Mi-24 - Size of Rounds","23 mm Autocannon\n57 mm Rockets\nIR Missiles"))
            put("EE_364", Questions(subject, category, "Mi-24 - Max Effective Ranges","23 mm Autocannon - 2,000 m\n57 mm Rockets - 6,000 m\nIR Missiles - 5,200 m"))
            put("EE_365", Questions(subject, category, "Mi-24 - Crew","3 PAX + 8 Dismounts"))
            put("EE_366", Questions(subject, category, "Mi-24 - Symbol","ic_symbol_mi24"))
            put("EE_367", Questions(subject, category, "ic_mi28","Mi-28"))
            put("EE_368", Questions(subject, category, "Mi-28 - Size of Rounds","30 mm Cannon\n122 mm Rockets\nIR Missiles\nATGM"))
            put("EE_369", Questions(subject, category, "Mi-28 - Max Effective Ranges","30 mm Cannon - 2,500 m\n122 mm Rockets - 3,000 m\nIR Missiles - 5,000 m\nATGM - 6,000 m"))
            put("EE_370", Questions(subject, category, "Mi-28 - Crew","2 PAX + 3 Dismounts"))
            put("EE_371", Questions(subject, category, "Mi-28 - Symbol","ic_symbol_mi28"))
            put("EE_372", Questions(subject, category, "ic_mi17","Mi-17"))
            put("EE_373", Questions(subject, category, "Mi-17 - Size of Rounds","12.7 mm MG\n80 mm Rockets\n57 mm Rockets\n7.62 mm"))
            put("EE_374", Questions(subject, category, "Mi-17 - Max Effective Range","12.7 mm MG - 1,500 m\n80 mm Rockets - 4,000 m\n57 mm Rockets - 4,000 m\n7.62 mm - 1,000 m"))
            put("EE_375", Questions(subject, category, "Mi-17 - Crew","3 PAX + 24 Dismounts"))
            put("EE_376", Questions(subject, category, "Mi-17 - Symbol","ic_symbol_mi17"))
            put("EE_377", Questions(subject, category, "ic_mt12","MT-12"))
            put("EE_378", Questions(subject, category, "MT-12 - Size of Rounds","100 mm"))
            put("EE_379", Questions(subject, category, "MT-12 - Max Effective Range","3,000 m"))
            put("EE_380", Questions(subject, category, "MT-12 - Crew","6 PAX"))
            put("EE_381", Questions(subject, category, "MT-12 - Symbol","ic_symbol_mt12"))
            put("EE_382", Questions(subject, category, "ic_2s6m1","2S6M1"))
            put("EE_383", Questions(subject, category, "2S6M1 - Size of Rounds","30 mm\nSA-19"))
            put("EE_384", Questions(subject, category, "2S6M1 - Max Effective Range","30 mm - 4,000 m (range), 3,000 m (altitude)\nSA-19 - 10,000 m"))
            put("EE_385", Questions(subject, category, "2S6M1 - Crew","4 PAX"))
            put("EE_386", Questions(subject, category, "2S6M1 - Symbol","ic_symbol_2s6m1"))
            put("EE_387", Questions(subject, category, "ic_su25","SU-25 Frogfoot"))
            put("EE_388", Questions(subject, category, "SU-25 Frogfoot - Size of Rounds","30 mm Gun\nATGM\nRockets"))
            put("EE_389", Questions(subject, category, "SU-25 Frogfoot - Max Effective Ranges","30 mm Gun - 4,000 m\nATGM - 6,000-7,000 m\nVarious Rockets - 4,000 m"))
            put("EE_390", Questions(subject, category, "SU-25 Frogfoot - Crew","1 PAX"))
            put("EE_391", Questions(subject, category, "SU-25 Frogfoot - Symbol","ic_symbol_su25"))
            put("EE_392", Questions(subject, category, "ic_2S9","2S9-1"))
            put("EE_393", Questions(subject, category, "2S9-1 - Size of Round","120 mm"))
            put("EE_394", Questions(subject, category, "2S9-1 - Max Effective Range","Ordinary Projectile - 8.85 km\nRocket Assisted - 12.8 km\nMines - 7.15 km"))
            put("EE_395", Questions(subject, category, "2S9-1 - Crew","4 PAX"))
            put("EE_396", Questions(subject, category, "2S9-1 - Symbol","ic_symbol_2s9"))
            put("EE_397", Questions(subject, category, "ic_2S19","2S19"))
            put("EE_398", Questions(subject, category, "2S19 - Size of Rounds","152 mm Main Gun\n12.7 mm COAX"))
            put("EE_399", Questions(subject, category, "2S19 - Max Effective Range","152 mm Main Gun - 24.7 km\n12.7 mm COAX - 2,000 m"))
            put("EE_400", Questions(subject, category, "2S19 - Crew","5 PAX"))
            put("EE_401", Questions(subject, category, "2S19 - Symbol","ic_symbol_2s19"))
            put("EE_402", Questions(subject, category, "ic_NSV","NSV"))
            put("EE_403", Questions(subject, category, "NSV - Size of Round","12.7 mm"))
            put("EE_404", Questions(subject, category, "NSV - Max Effective Range","2,000 m"))
            put("EE_405", Questions(subject, category, "NSV - Symbol","ic_symbol_nsv"))
            put("EE_406", Questions(subject, category, "ic_bm14","BM-14"))
            put("EE_407", Questions(subject, category, "BM-14 - Size of Round","140 mm"))
            put("EE_408", Questions(subject, category, "BM-14 - Max Effective Range","10,000 m"))
            put("EE_409", Questions(subject, category, "BM-14 - Crew","7 PAX"))
            put("EE_410", Questions(subject, category, "BM-14 - Symbol","ic_symbol_bm14"))
            put("EE_411", Questions(subject, category, "ic_bm21","BM-21"))
            put("EE_412", Questions(subject, category, "BM-21 - Size of Round","122 mm Rockets"))
            put("EE_413", Questions(subject, category, "BM-21 - Max Effective Range","32.7 km"))
            put("EE_414", Questions(subject, category, "BM-21 - Crew","5 PAX"))
            put("EE_415", Questions(subject, category, "BM-21 - Symbol","ic_symbol_bm21"))
            put("EE_416", Questions(subject, category, "ic_at14","AT-14 Kornet"))
            put("EE_417", Questions(subject, category, "AT-14 Kornet - Size of Round","152 mm"))
            put("EE_418", Questions(subject, category, "AT-14 Kornet - Max Effective Range","5,500 m"))
            put("EE_419", Questions(subject, category, "AT-14 Kornet - Crew","2 PAX"))
            put("EE_420", Questions(subject, category, "AT-14 Kornet - Symbol","ic_symbol_at14"))
        }
    }

    private fun loadUnitSymbols(subject: String) {
        val category = "Unit Symbols"
        with(questionsDeck) {
            put("EE_421", Questions(subject, category, "IBCT Infantry Battalion","ic_ibct_infantry_bn"))
            put("EE_422", Questions(subject, category, "IBCT Infantry Company","ic_ibct_infantry_co"))
            put("EE_423", Questions(subject, category, "IBCT Infantry Platoon","ic_ibct_infantry_plt"))
            put("EE_424", Questions(subject, category, "IBCT Airborne Infantry Battalion","ic_ibct_airborne_infantry_bn"))
            put("EE_425", Questions(subject, category, "IBCT Air Assault Battalion","ic_ibct_air_assault_bn"))
            put("EE_426", Questions(subject, category, "IBCT Air Assault Company","ic_ibct_air_assault_co"))
            put("EE_427", Questions(subject, category, "IBCT Air Assault Platoon","ic_ibct_air_assault_plt"))
            put("EE_428", Questions(subject, category, "IBCT Weapons Company","ic_ibct_weapons_co"))
            put("EE_429", Questions(subject, category, "IBCT Mortar Section","ic_ibct_mortar_sec"))
            put("EE_430", Questions(subject, category, "ABCT CAB","ic_abct_cab"))
            put("EE_431", Questions(subject, category, "ABCT Infantry Company","ic_abct_infantry_co"))
            put("EE_432", Questions(subject, category, "ABCT Infantry Platoon","ic_abct_infantry_plt"))
            put("EE_433", Questions(subject, category, "ABCT Mortar Platoon","ic_abct_mortar_plt"))
            put("EE_434", Questions(subject, category, "SBCT Infantry Battalion","ic_sbct_infantry_bn"))
            put("EE_435", Questions(subject, category, "SBCT Infantry Company","ic_sbct_infantry_co"))
            put("EE_436", Questions(subject, category, "SBCT Infantry Platoon","ic_sbct_infantry_plt"))
            put("EE_437", Questions(subject, category, "SBCT MGS Platoon","ic_sbct_mgs_plt"))
            put("EE_438", Questions(subject, category, "SBCT Mortar Platoon","ic_sbct_mortar_plt"))
            put("EE_439", Questions(subject, category, "SBCT Mortar Section","ic_sbct_mortar_sec"))
            put("EE_440", Questions(subject, category, "IBCT Cavalry Squadron","ic_ibct_cavalry_sqdrn"))
            put("EE_441", Questions(subject, category, "ABCT Cavalry Squadron","ic_abct_cavalry_sqdrn"))
            put("EE_442", Questions(subject, category, "SBCT Cavalry Squadron","ic_sbct_cavalry_sqdrn"))
            put("EE_443", Questions(subject, category, "IBCT Cavalry Troop","ic_ibct_cavalry_trp"))
            put("EE_444", Questions(subject, category, "ABCT Cavalry Troop","ic_abct_cavalry_trp"))
            put("EE_445", Questions(subject, category, "SBCT Cavalry Troop","ic_sbct_cavalry_trp"))
            put("EE_446", Questions(subject, category, "IBCT Reconnaissance Platoon","ic_ibct_reconnaissance_plt"))
            put("EE_447", Questions(subject, category, "ABCT Reconnaissance Platoon","ic_abct_reconaissance_plt"))
            put("EE_448", Questions(subject, category, "SBCT Reconnaissance Platoon","ic_sbct_reconnaisance_plt"))
            put("EE_449", Questions(subject, category, "CA Team","ic_ca_tm"))
            put("EE_450", Questions(subject, category, "MISO Team (Military Information Support Operations)","ic_miso_tm"))
            put("EE_451", Questions(subject, category, "Special Forces Unit","ic_special_forces"))
            put("EE_452", Questions(subject, category, "Ranger Unit","ic_ranger"))
            put("EE_453", Questions(subject, category, "Multiple Rocket Launcher Artillery Unit","ic_multiple_rocket_launcher_artillery"))
            put("EE_454", Questions(subject, category, "Single Rocket Launcher Artillery Unit","ic_single_rocket_launcher_artillery"))
            put("EE_455", Questions(subject, category, "Tube Artillery Unit","ic_tube_artillery"))
            put("EE_456", Questions(subject, category, "Equivalent Threat Units","ic_equivalent_threat"))
        }
    }

    // 1. A1
    private fun loadA1Questions(subject: String) {
        loadDoctrineAndULO(subject)
        loadIBCT(subject)
        loadIPB(subject)
        loadTLPs(subject)
    }

    private fun loadDoctrineAndULO(subject: String) {
        val category = "Doctrine and Unified Land Operations"
        with (questionsDeck) {
            put("A1_0", Questions(subject, category, "3x approved types of Army doctrine", "1) Army Doctrine Publication (ADP)\n2) Field Manual (FM)\n3) Army Technical Publication (ATP)"))
            put("A1_1", Questions(subject, category, "Unified Action", "The synchronization coordination and/or integration of the activities of government and non governmental entities with military operations to achieve unity of effort."))
            put("A1_2", Questions(subject, category, "Unified Land Operations", "Simultaneous offensive, defensive, stability, or defensive support of civil authorities tasks to seize, retain, and exploit the initiative to shape the operating environment, prevent conflict, consolidate gains, and win the nation's wars."))
            put("A1_3", Questions(subject, category, "Tenets of Unified Land Operations", "1) Depth\n2) Flexibility\n3) Simultaneity\n4) Synchronization"))
            put("A1_4", Questions(subject, category, "Mission Variables", "TMT-CET\n1) Time\n2) Mission\n3) Terrain and Weather\n4) Civil Considerations\n5) Enemy Forces\n6) Troops"))
            put("A1_5", Questions(subject, category, "Operational Variables", "PMESII-PT\n1) Political\n2) Military\n3) Economic\n4) Social\n5) Infrastructure\n6) Information\n7) Physical Environment\n8) Time"))
            put("A1_6", Questions(subject, category, "Principles of Unified Land Operations", "1) Mission Command\n2) Develop the Situation through Action\n3) Combined Arms\n4) Adhere to the Law of War\n5) Establish and Maintain Security\n6) Create Multiple Dilemmas for the Enemy"))
            put("A1_7", Questions(subject, category, "Combat Power", "1) Leadership\n2) Information\n3) Mission Command\n4) Movement and Maneuver\n5) Intelligence\n6) Fires\n7) Sustainment\n8) Protection"))
            put("A1_8", Questions(subject, category, "Warfighting Functions", "1) Mission Command\n2) Movement and Maneuver\n3) Intelligence\n4) Fires\n5) Sustainment\n6) Protection"))
            put("A1_9", Questions(subject, category, "Mission Command", "The Army's approach to command and control that empowers subordinate's decision making and decentralized execution appropriate to the situation."))
            put("A1_10", Questions(subject, category, "Mission Command is Enabled by", "1) Competence\n2) Mutual trust\n3) Shared understanding\n4) Commander's intent\n5) Mission orders\n6) Disciplined initiative\n7) Risk acceptance"))
            put("A1_11", Questions(subject, category, "Elements of Command", "1) Authority\n2) Responsibility\n3) Decision Making\n4) Leadership"))
            put("A1_12", Questions(subject, category, "Elements of Control", "1) Direction\n2) Feedback\n3) Information\n4) Communication"))
            put("A1_13", Questions(subject, category, "Characteristics of the Offense", "1) Surprise\n2) Concentration\n3) Audacity\n4) Tempo"))
            put("A1_14", Questions(subject, category, "Forms of Maneuver", "1) Frontal Attack\n2) Infiltration\n3) Penetration\n4) Envelopment\n5) Turning Movement"))
            put("A1_15", Questions(subject, category, "Offensive Tasks", "1) Movement to Contact\n2) Attack\n3) Exploitation\n4) Pursuit"))
            put("A1_16", Questions(subject, category, "Special Purpose Attacks", "1) Ambush\n2) Counterattack\n3) Demonstration\n4) Feint\n5) Raid\n6) Spoiling Attack"))
        }
    }

    private fun loadIBCT(subject: String) {
        val category = "Infantry Brigade Combat Team"
        with (questionsDeck) {
            put("A1_17", Questions(subject, category, "IBCT Task Organization","ic_ibct"))
            put("A1_18", Questions(subject, category, "IBCT Company Task Organization","ic_ibct_co"))
            put("A1_19", Questions(subject, category, "IBCT Weapons Company Task Organization","ic_ibct_wpn_co"))
            put("A1_20", Questions(subject, category, "IBCT Limitations","The IBCT lacks the ability to decisively close with and destroy the enemy under restricted terrains\n\nThe IBCT lacks the ability to maneuver and survive in close combat against hardened enemy fortifications, light armored vehicles, and dismounted personnel.\n\nIBCTs lack the support of a mobile protected firepower capability to apply immediate, lethal, long-range direct fires in the engagement of hardened enemy bunkers, light armored vehicles, and dismounted personnel in machine gun and sniper positions; with all-terrain mobility and scalable armor protection; capable of conducting operations in all environments."))
        }
    }

    private fun loadIPB(subject: String) {
        val category = "Information Preparation of the Battlefield"
        with (questionsDeck) {
            put("A1_21", Questions(subject, category,"Steps of IPB", "1) Define the operational environment\n2) Describe environmental effects on operations\n3) Evaluate the threat\n4) Determine the threat"))
            put("A1_22", Questions(subject, category,"1) Define the Operating Environment", "1) Define the AO:\n  - Orient\n  - Box\n  - Trace\n  - Familiarize\n\n2) Define Area of Interest:\n  - CAS/CCA\n  - Artillery/Fires\n  - Reserves\n  - Other\n\n3) Define the Area of Influence\n  - Boundaries\n  - Civil Considerations"))
            put("A1_23", Questions(subject, category,"2) Describe Environmental Effects on Operations", " - Terrain Analysis\n  - Weather Analysis\n  - Conduct Civil Analysis"))
            put("A1_24", Questions(subject, category,"Steps of Terrain Analysis", "1) Obstacles\n2) Avenues of Approach\n3) Key Terrain\n4) Observations and Fields of Fire\n5) Cover and Concealment"))
            put("A1_25", Questions(subject, category,"Steps of Weather Analysis", "1) Visibility\n2) Wind\n3) Precipitation\n4) Cloud Cover\n5) Temperature and Humidity"))
            put("A1_26", Questions(subject, category,"Steps of Civil Considerations", "1) Areas\n2) Structures\n3) Capabilities\n4) Organizations\n5) People\n6) Events"))
            put("A1_27", Questions(subject, category,"3) Evaluate the Threat", "1) General Situation\n2) Disposition\n3) Composition\n4) Strength"))
            put("A1_28", Questions(subject, category,"4) Define Threat COAs", "1) Enemy Capabilities by War Fighting Functions\n2) Threat COA\n  - Most likely\n  - Most dangerous"))
            put("A1_29", Questions(subject, category,"High Value Target vs. High Priority Target", "HVT - Enemy Commander needs in order to accomplish his mission\n\nHPT - Loss to enemy will significantly contribute to the success of OPFOR mission"))
        }
    }

    private fun loadTLPs(subject: String) {
        val category = "Troop Leading Procedures"
        with (questionsDeck) {
            put("A1_30", Questions(subject, category, "Troop Leading Procedures (FM 6-0)", "1) Receive the Mission\n2) Issue a warning order\n3) Make a tentative plan\n4) Initiate movement\n5) Conduct reconnaissance\n6) Complete the plan\n7) Issue the order\n8) Supervise and refine\n"))
            put("A1_31", Questions(subject, category, "Issue the Warning Order - Minimum Information", "1) Mission or nature of operation\n2) Time and place for issue of OPORD\n3) Units or elements participating\n4) Specific tasks not addressed in SOPs\n5) Timeline for operation\n6) Information Requirements\n7) CCIR (PIR & FFIR)"))
            put("A1_32", Questions(subject, category, "Make a Tentative Plan - Mission Analysis", "1) Higher mission 2 and 1 levels up\n2) Unit Purpose\n3) Constraints\n4) Specified, Implied, and Essential Tasks\n5) Restated Mission"))
            put("A1_33", Questions(subject, category, "Decisive Point", "A geographic place, time, or event which when acted upon offers a marked advantage over the enemy"))
            put("A1_34", Questions(subject, category, "Steps of COA Development", "AGADAAP\nA) Analyze combat power\nG) Generate options\nA) Array forces\nD) Develop concept of the operations\nA) Analyze soldier load\nA) Assign responsibility\nP) Prepare COA statement and sketch"))
            put("A1_35", Questions(subject, category, "Wargaming Techniques", "1) Box\n2) Belt\n3) Avenue in Depth"))
            put("A1_36", Questions(subject, category, "Annexes of the OPORD", "A) Task Organization\nB) Intelligence\nC) Operations\nD) Fires\nE) Protection\nF) Sustainment\nG) Engineer\nH) Signal\nJ) Public Affairs\nK) Civil Affairs Operations\nL) Information Collection"))
            put("A1_37", Questions(subject, category, "Aspects of Commander\'s Intent", "1) Purpose\n2) Key Tasks\n3) End State"))
            put("A1_38", Questions(subject, category, "Method to arrive to end state", "Commander will analyze higher's expanded purpose, then decide how to achieve his non-COA specific end state through the accomplishment of identified key tasks"))
        }
    }

    // 2. A2
    private fun loadA2Questions(subject: String) {
        loadABCT(subject)
        loadArmorTTPs(subject)
        loadA2Breaching(subject)
        loadDirectFireControlMeasures(subject)
        loadControlMeasures(subject)
        loadA2OPFOR(subject)
    }

    private fun loadABCT(subject: String) {
        val category = "Armor Brigade Combat Team"
        with (questionsDeck) {
            put("A2_0", Questions(subject, category,"ABCT Infantry Company Org", "ic_abct_mech_co"))
            put("A2_1", Questions(subject, category,"ABCT Armor Company Task Organization", "ic_abct_co"))
        }
    }

    private fun loadArmorTTPs(subject: String) {
        val category = "Armor TTPs"
        with (questionsDeck) {
            put("A2_2", Questions(subject, category,"Seven ABCT Combat Formations", "- column\n- line\n- echelon\n- wedge\n- vee\n- herringbone/coil\n- staggered column"))
            put("A2_3", Questions(subject, category,"Movement Techniques", "1) Traveling\n2) Traveling Overwatch\n3) Bounding Overwatch"))
            put("A2_4", Questions(subject, category,"Eight Forms of Contact", "DINOCAVE\n- direct\n- indirect\n- non hostile\n- obstacles\n- CBRN\n- aerial\n- visual\n- electronic warfare (EW)"))
            put("A2_5", Questions(subject, category,"Three options for infantry dismount points", "- short of the objective\n- on the objective\n- beyond the objective"))
            put("A2_6", Questions(subject, category,"Advantages/disadvantages of dismounting short of the objective", "Advantages:\n  - protection of infantry during dismount\n  - control at dismount point & time to orient infantry\n\nDisadvantages:\n  - exposure of infantry to the OBJ\n  - overall speed of movement"))
            put("A2_7", Questions(subject, category,"Advantages/disadvantages of dismounting on the objective", "Advantages:\n  - greater speed and enhanced protection of the squads\n\nDisadvantages:\n  - difficult to orient infantry on the OBJ\n  - less control at dismount points\n  - exposure to AT weapons"))
            put("A2_8", Questions(subject, category,"Advantages/disadvantages beyond the objective", "Advantages:\n  - more control at the dismount point\n  - ease in orienting IN\n  - confusion or disorientation on ENY being forced to fight in an unexpected direction\n\nDisadvantages:\n  - vulnerability to ENY attack in depth/reserves\n  - risk of fratricide\n  - vulnerable to short range AT"))
            put("A2_9", Questions(subject, category,"M1 Plow (Mine Clearing Blade)", "- three settings (6 in, 12 in, 18 in)\n- designed to displace mines\n- drop 100m before your breach lane\n- can be used to reduce OR proof OR as another asset's redundancy"))
            put("A2_10", Questions(subject, category,"M1 Roller", "- used to detonate mines\n- significantly reduces speed of movement\n- used for proofing"))
            put("A2_11", Questions(subject, category,"Assault Breacher Vehicle", "- M1 chassis\n- 1x .50 CAL\n- 2x MICLICs (can clear 14mx200m total)\n- can reduce, proof, AND mark OR act as another system's redundancy\n- sapper's typically have to mark\n- mounted plow can proof"))
            put("A2_12", Questions(subject, category,"M58 MICLIC (Mine Clearing Line Charge)", "Clears 14m x 100m lane"))
            put("A2_13", Questions(subject, category,"M104 Wolverine OR JAB (Joint Assault Bridge)", "- can provide bridge for 18m dry gap\n- 3-5 minutes to deploy"))
            put("A2_14", Questions(subject, category,"M9 ACE (Armored Combat Earthmover)", "- can be used to clear a lane\n- primary option for reducing an anti-tank ditch"))
        }
    }

    private fun loadA2Breaching(subject: String) {
        val category = "Breaching"
        with (questionsDeck) {
            put("A2_15", Questions(subject, category,"Breaching Tenets", "IFOMS\n- Intelligence\n- Fundamentals of Breaching\n- Breaching Organization\n- Mass\n- Synchronization"))
            put("A2_16", Questions(subject, category,"Breach commitment criteria", "- Defined in terms of numerical suppression\n- We need to destroy x amount of y vehicles to define suppression on the OBJ prior to committing the breach force."))
            put("A2_17", Questions(subject, category,"Breaching Task Organization", "- Support\n- Breach\n- Assault"))
            put("A2_18", Questions(subject, category,"Breaching Fundamentals", "SOSRA\n- Suppress\n- Obscure\n- Secure\n- Reduce\n- Assault"))
            put("A2_19", Questions(subject, category,"Three types of breaching", "1) Hasty\n2) Deliberate\n3) Covert"))
            put("A2_20", Questions(subject, category,"SEAD", "Suppression of enemy air defense"))
            put("A2_21", Questions(subject, category,"Methods of breaching (reduction techniques)", "1) Explosive\n2) Mechanical\n3) Physical\n4) Ballistic"))
        }
    }

    private fun loadDirectFireControlMeasures(subject: String) {
        val category = "Direct Fire Control Measures"
        with (questionsDeck) {
            put("A2_22", Questions(subject, category,"Principles of Direct Fire Control (ATP 3-90.1)", "1) Mass the effects of fire\n2) Destroy the greatest threat first\n3) Avoid target overkill\n4) Employ the best weapon for specific targets\n5) Minimize friendly forces exposure\n6) Plan and implement fratricide avoidance measures\n7) Plan for limited visibility conditions\n8) Plan for degraded capabilities"))
            put("A2_23", Questions(subject, category,"Terrain-Based Fire Control Measures", "Target Reference Point\nEngagement Area\nSector of Fire\nDirection of Fire\nTerrain-Based Quadrant\nFriendly-Based Quadrant\nMaximum Engagement Line\nRestrictive Fire Line\nFinal Protective Line"))
            put("A2_24", Questions(subject, category,"Threat-Based Fire Control Measures", "Fire Pattern\nTarget Array\nEngagement Priorities\nWeapon Ready Posture\nEngagement Criteria\nWeapon Control Status\nRules of Engagement\nWeapons Safety Posture\nEngagement Techniques"))
            put("A2_25", Questions(subject, category,"Two primary types of resupply", "1) Tailgate - Combat vehicles remain in their positions or back out a short distance to allow trucks carrying supplies to reach them\n2) Service Station - Vehicles move to centrally located resupply point"))
        }
    }

    private fun loadControlMeasures(subject: String) {
        val category = "Control Measures"
        with (questionsDeck) {
            put("A2_26", Questions(subject, category, "Air Corridor","ic_air_corridor"))
            put("A2_27", Questions(subject, category, "Control measures for passage of lines","LKP) Linkup Point\nSP) Starting Point\nPP) Passage Point\nRP) Release Point\nBHL) Battle Handover Line"))
            put("A2_28", Questions(subject, category, "Passage of Lines Task Organization","1) Stationary Element\n2) Passing Element"))
        }
    }

    private fun loadA2OPFOR(subject: String) {
        val category = "OPFOR"
        with (questionsDeck) {
            put("A2_29", Questions(subject, category,"What are the standard OPFOR detachment task organizations?", "BDET - Battalion size detachment\nCDET - Company size detachment"))
            put("A2_30", Questions(subject, category,"What is a CSOP?", "Combat Security Outpost"))
            put("A2_31", Questions(subject, category,"5 tasks of the CSOP", "1) Ambush\n2) Attack by Fire\n3) Delay\n4) Disrupt\n5) Fix"))
            put("A2_32", Questions(subject, category,"Typical CSOP unit size", "Platoon or squad size elements; Task organized as part of the disruption element."))
            put("A2_33", Questions(subject, category,"Basic OPFOR zones", "1) Disruption Zone\n2) Battle Zone\n3) Support Zone"))
            put("A2_34", Questions(subject, category,"Attack Zone", "An area that is given to a subordinate unit with an offensive mission, to delineate clearly where forces will be conducting offensive maneuver."))
            put("A2_35", Questions(subject, category,"Kill Zone", "A designated area on the battlefield where the OPFOR plans to destroy a key enemy target."))
            put("A2_36", Questions(subject, category,"Planned Defense", "A defensive mission or action undertaken when there is sufficient time and knowledge of the situation to prepare and rehearse forces for specific tasks. Typically, the enemy is in a staging or assembly area and in a known location and status."))
            put("A2_37", Questions(subject, category,"Situational Defense", "Occurs when the situation changes during course of a battle, and OPFOR on the offensive must adopt a defensive posture."))
            put("A2_38", Questions(subject, category,"Functional organization of the BTG in the defense", "1) Disruption Force\n2) Main Defense Force\n3) Reserves"))
            put("A2_39", Questions(subject, category,"Two OPFOR forces in a maneuver defense", "1) Contact Force\n2) Shielding Force"))
            put("A2_40", Questions(subject, category,"Maneuver Defense", "Trades terrain for the opportunity to destroy portions of the BLUFOR formation."))
            put("A2_41", Questions(subject, category,"Area Defense", "Trades time for the opportunity to attack BLUFOR"))
            put("A2_42", Questions(subject, category,"Two types of battle positions", "1) Simple battle position\n2) Complex battle position"))
            put("A2_43", Questions(subject, category,"Simple Battle Position", "A defensive location oriented on the most likely enemy avenue of approach; not necessarily tied to complex terrain."))
            put("A2_44", Questions(subject, category,"Complex Battle Position", "A defensive location designed to employ a combination of complex terrain and engineer efforts to protect unit within them from detection and attack; not necessarily tied to an avenue of approach"))
            put("A2_45", Questions(subject, category,"Types of OPFOR task organization", "- OSG (operational strategic group)\n- DTG (division tactical groups)\n- BTG (brigade tactical group)\n- BDET (battalion detachment)\n- CDET (company detachment)"))
            put("A2_46", Questions(subject, category,"Battle Zone", "The area where the defending commander commits a major part of his force to the task of defeating attacking enemy forces, or delaying them while the defenders withdraw."))
            put("A2_47", Questions(subject, category,"Support Zone", "The area contains C2, CSS, indirect and direct support fire assets, the reserve, and other supporting assets or logistics."))
            put("A2_48", Questions(subject, category,"Contact Force", "The force occupying the defensive array in current or imminent contact with the BLUFOR"))
            put("A2_49", Questions(subject, category,"Shielding Force", "The force occupying a defensive array that permits contact force to reposition"))
            put("A2_50", Questions(subject, category,"Two types of defense", "1) Planned defense\n2) Situational defense"))
            put("A2_51", Questions(subject, category,"Five steps of action on contact", "- Deploy and report\n- Evaluate and develop the situation\n- choose a COA\n- Execute the selected COA\n- Recommend a COA to the higher commander"))
            }
    }

    // 3. A3
    private fun loadA3Questions(subject: String) {
        loadDefense(subject)
        loadA3Reconnaissance(subject)
        loadA3Security(subject)
        loadA3Offense(subject)
        loadA3Equipment(subject)
        loadA3OPFOR(subject)
    }

    private fun loadDefense(subject: String) {
        val category = "Defense"
        with(questionsDeck) {
            put("A3_0", Questions(subject, category,"Characteristics of the Defense", "- Disruption\n- Flexibility\n- Maneuver\n- Mass & Concentration\n- Operations in Depth\n- Preparation\n- Security"))
            put("A3_1", Questions(subject, category,"Purposes of the Defense", "- Create conditions for the counter offensive that allow forces to regain the initiative\n- Retain decisive terrain or deny vital areas to the enemy\n- Attrit or fix enemy as a prelude to offensive actions\n- Surprise action of the enemy\n- Increase enemy's vulnerability by forcing them to concentrate forces"))
            put("A3_2", Questions(subject, category,"Defensive Tasks", "- Area Defense\n- Mobile Defense\n- Retrograde"))
            put("A3_3", Questions(subject, category,"Area Defense", "A type of defensive operation that concentrates on denying enemy forces access to designated terrain for a specific time rather than destroying the enemy outright."))
            put("A3_4", Questions(subject, category,"Mobile Defense", "A type of defensive operation that concentrates on the destruction or defeat of the enemy through a decisive attack by a striking force."))
            put("A3_5", Questions(subject, category,"Retrograde", "A type of defensive operation that involves organized movement away from the enemy."))
            put("A3_6", Questions(subject, category,"Three variations of the retrograde.", "- Delay\n- Withdraw\n- Retirement"))
            put("A3_7", Questions(subject, category,"Delay", "A force under pressure trades space for time by slowing down the enemy’s momentum and inflicting maximum damage on enemy forces without becoming decisively engaged."))
            put("A3_8", Questions(subject, category,"Withdraw", "Disengage from an enemy force and move in a direction away from the enemy."))
            put("A3_9", Questions(subject, category,"Retirement", "A force out of contact moves away from the enemy."))
            put("A3_10", Questions(subject, category,"Five Types of Battle Positions", "- Primary\n- Alternate\n- Supplementary\n- Subsequent\n- Strong point"))
            put("A3_11", Questions(subject, category,"Primary Battle Position", "The position that covers the enemy’s most likely avenue of approach into the area of operations."))
            put("A3_12", Questions(subject, category,"Alternate Battle Position", "The defensive position that the commander assigns to a unit or weapon system for occupation when the primary position becomes untenable or unsuitable for carrying out the assigned task, but still covers the primary engagement area."))
            put("A3_13", Questions(subject, category,"Supplementary Battle Position", "A defensive position located within a unit’s assigned area of operations that provides the best sectors of fire and defensive terrain along an avenue of approach that is not the primary avenue where the enemy is expected to attack."))
            put("A3_14", Questions(subject, category,"Subsequent Battle Position", "A position that a unit expects to move to during the course of battle"))
            put("A3_15", Questions(subject, category,"Strong Point", "A  heavily fortified battle position tied to a natural or reinforcing obstacle to create an anchor for the defense or to deny the enemy decisive or key terrain."))
            put("A3_16", Questions(subject, category,"Steps of Engagement Area Development", "1) Identify the enemy avenues of approach\n2) Determine the likely enemy scheme of maneuver\n3) Determine where to kill the enemy\n4) Plan and integrate obstacles\n5) Emplace direct fire weapon systems\n6) Plan and integrate indirect fires\n7) Rehearse the engagement"))
            put("A3_17", Questions(subject, category,"Two ways to depict composition of a BP", "1) SLANT\n  - TANK / IFV / VIC / SQD\n  - 8/4/2/2\n\n2) Graphically depicted"))
            put("A3_18", Questions(subject, category,"Phases of the Defense", "1) Recon & security\n2) Occupation\n3) Enemy approach\n4) Enemy assault\n5) Counter attack\n6) Consolidate & reorganize"))
            put("A3_19", Questions(subject, category,"Four Effects of Obstacles", "1) Disrupt\n2) Fix\n3) Turn\n4) Block"))
            put("A3_20", Questions(subject, category,"Battle Handover Line", "The designated phase line on the ground where responsibility transitions from the stationary force to the moving force and vice versa"))
            put("A3_21", Questions(subject, category,"Types of vehicular fighting positions", "1) Hull defilade position\n2) Turret defilade position\n3) Hide location"))
            put("A3_22", Questions(subject, category,"Hull Defilade Position", "The vehicle turret is left above ground, allowing it to observe and engage targets."))
            put("A3_23", Questions(subject, category,"Turret Defilade Position", "The entire vehicle is below ground. An HDP is required in front of vehicle to allow it to engage."))
            put("A3_24", Questions(subject, category,"Hide Position", "A vehicle is concealed away from the fighting position, included overhead cover when possible"))
            put("A3_25", Questions(subject, category,"Reasons to implement a reverse slope defense", "1) The crest and forward slope are untenable because the enemy enjoys a quantitative or qualitative advantage in firepower at the point\n2) His weapon cannot deporess enough to engage\n3) The crest and forward slope offer little or no cover and concealment\n4) The forward slope has been lost or has not been seized\n5) Units on the flanks can adequetly cover the forward slope\n6) Variance in the force's tactical pattern is advisable to deceive or surprise the enemy\n7) The commander is forced to assume a hasty defense in contact with or close to the enemy"))
            put("A3_26", Questions(subject, category,"Obstacle Effect: Turn", "A tactical obstacle effect that integrates fire planning and obstacle effort to divert an enemy formation from one avenue of approach to an adjacent avenue of approach or into an engagement area."))
            put("A3_27", Questions(subject, category,"Obstacle Effect: Block", "An obstacle effect that integrates fire planning and obstacle effort to stop an attacker along a specific avenue of approach or to prevent the attacking force from passing through an engagement area."))
            put("A3_28", Questions(subject, category,"Obstacle Effect: Disrupt", "An obstacle effect that focuses fire planning and obstacle effort to cause the enemy to break up his formation and tempo, interrupt his timetable, commit breaching assets prematurely, and attack in a piecemeal effort."))
            put("A3_29", Questions(subject, category,"Obstacle Effect: Fix", "An obstacle effect that focuses fire planning and obstacle effort to slow an attacker’s movement within a specified area, normally an engagement area."))
            put("A3_30", Questions(subject, category,"Dig Rates for D7 Dozer and ACE", "D7 TM (2x vics)\n  - hull = 1.5 hours\n  - turret = 4 hours\n\nACE (2x vics)\n  - hull = 2.5 hours\n  - turret = 5.5 hours"))
        }
    }

    private fun loadA3Reconnaissance(subject: String) {
        val category = "Reconnaissance"
        with(questionsDeck) {
            put("A3_31", Questions(subject, category,"Fundamentals of Reconnaissance", "1) Ensure continuous reconnaissance\n2) Do not keep reconnaissance assets in reserve\n3) Orient on the reconnaissance objective\n4) Report information rapidly and accurately\n5) Retain freedom of maneuver\n6) Gain and maintain enemy contact\n7) Develop the situation rapidly"))
            put("A3_32", Questions(subject, category,"Forms of Reconnaissance", "1) Route reconnaissance\n2) Area reconnaissance\n3) Zone reconnaissance\n4) Reconnaissance in force\n5) Special reconnaissance"))
        }
    }

    private fun loadA3Security(subject: String) {
        val category = "Security"
        with(questionsDeck) {
            put("A3_33", Questions(subject, category,"Fundamentals of Security", "1) Provide early and accurate warning\n2) Provide reaction time and maneuver space\n3) Orient on the force or facility to be secured\n4) Perform continuous reconnaisance\n5) Maintain enemy contact"))
            put("A3_34", Questions(subject, category,"Types of Security Operations", "1) Screen\n2) Guard\n3) Cover\n4) Area security\n5) Local security"))
            put("A3_35", Questions(subject, category,"Screen", "Security task that primarily provides early warning to the protected force. Conducted by PLT or higher."))
            put("A3_36", Questions(subject, category,"Guard", "Security task to protect the main body by fighting to gain time while also observin and reporting information and preventing enemy ground observation of and direct fire against the main body. Units conducting a guard mission cannot operate independently because they rely upon fires and functional and multi-functional support assets of the main body."))
            put("A3_37", Questions(subject, category,"Cover", "Security task to protect the main body by fighting to gain time while also observing and reporting information and preventing enemy ground observation of and direct fire against the main body. Capable of operating independently."))
        }
    }

    private fun loadA3Offense(subject: String) {
        val category = "Offense"
        with(questionsDeck) {
            put("A3_38", Questions(subject, category,"Principles of Direct Fire Control (ATP 3-90.1)", "1) Mass the effects of fire\n2) Destroy the greatest threat first\n3) Avoid target overkill\n4) Employ the best weapon for specific targets\n5) Minimize friendly forces exposure\n6) Plan and implement fratricide avoidance measures\n7) Plan for limited visibility conditions\n8) Plan for degraded capabilities"))
        }
    }

    private fun loadA3Equipment(subject: String) {
        val category = "Equipment"
        with(questionsDeck) {
            put("A3_39", Questions(subject, category,"MT-55", "US Equivalent: WOLVERINE\n- 3x17m bridge\n- 2 min emplacement time"))
            put("A3_40", Questions(subject, category,"MTK-2", "US Equivalent: ABV\n- 93m explosive line charge\n- 3-5 min breach time"))
            put("A3_41", Questions(subject, category,"KMT-5", "US Equivalent: M1A2 w/ plow\n- roller & plow system\n- 8-12 kph clearance rate"))
            put("A3_42", Questions(subject, category,"KMT-6", "- mounted mine plow\n- mounts on T-64 MBT"))
            put("A3_43", Questions(subject, category,"IMR-2", "US Equivalent: ACE\n- 12.7mm MG\n- telescopic crane\n- bulldozer blade"))
            put("A3_44", Questions(subject, category,"BAT-2", "US Equivalent: ACE\n- tracked plow vehicle"))
            put("A3_45", Questions(subject, category,"SU-25", "US Equivalent: A-10\n- FW CAS\n- 23/30mm twin barrel gun (4km)\n- 10x total hardpoints (AT-16 ATGMs (10km), guided rockets, & bombs)\n- armored up to 30mm"))
            put("A3_46", Questions(subject, category,"SA-11", "US Equivalent: PATRIOT\n- ADA system\n- 400mm rockets\n- 36 km range"))
            put("A3_47", Questions(subject, category,"SA-10", "US Equivalent: PATRIOT\n- ADA system\n- 450mm rockets\n- 47-75km range"))
            put("A3_48", Questions(subject, category,"BM-30", "US Equivalent: MLRS\n- MLRS system\n- 300mm rockets\n- 20-70km range"))
            put("A3_49", Questions(subject, category,"BM-21", "US Equivalent: MLRS\n- MLRS rocket system\n- 122mm rockets\n- 20.4 km range"))
        }
    }

    private fun loadA3OPFOR(subject: String) {
        val category = "OPFOR"
        with(questionsDeck) {
            put("A3_50", Questions(subject, category,"Enemy task organization for an offense", "1) Fixing Force\n2) Assault Force (Breach Force)\n3) Exploitation Force"))
            put("A3_51", Questions(subject, category,"Two types of OPFOR attack", "1) Integrated Attack\n2) Dispersed Attack"))
            put("A3_52", Questions(subject, category,"Integrated Attack", "OPFOR seeks military decision by destroying the enemy's will and/or ability to continue fighting through the application of combined arms effect"))
            put("A3_53", Questions(subject, category,"Dispersed Attack", "Primary manner in which the OPFOR conducts offensive action when threatened by a superior enemy and/or when unable to mass or provide integrated C2 attack"))
        }
    }

    // 4. A4
    private fun loadA4Questions(subject: String) {
        loadSBCT(subject)
        loadUrbanOperations(subject)
        loadA4Offense(subject)
        loadA4Breaching(subject)
        loadA4OPFOR(subject)
    }

    private fun loadSBCT(subject: String) {
        val category = "SBCT"
        with(questionsDeck) {
            put("A4_0", Questions(subject, category, "Stryker Capabilities","- Increased combat power from a standard Infantry company with the addition of a fourth platoon (mobile gun system platoon).\n- Increased tactical mobility for Infantry.\n- Carries and employs assortment of weapons to the fight with a “mobile arms room” concept.\n- Equipped with organic 120-mm and 60-mm mortars.\n- Authorized organic Sniper team.\n- Self-sustained for 72 hours or mission dependent fuel consumption rates.\n- Conduct offensive, defensive, and stability tasks in all types of environments.\n- Seize, secure, occupy, and retain terrain.\n- Destroy, neutralize, suppress, interdict, disrupt, block, canalize, and fix enemy forces.\n- Breach enemy obstacles.\n- Can conduct feints and demonstrations to deceive the enemy.\n- Reconnoiters, denies, bypasses, clears, contains, and isolates. (These tasks might be oriented\non both terrain and enemy.)\n- Operates in conjunction with mounted or special operations forces."))
            put("A4_1", Questions(subject, category, "Stryker Limitations","- Vulnerable to indirect fires while dismounted.\n- Reduced company logistical systems.\n- Has no organic maintenance section.\n- Unable to conduct forced entry by air; requires preoperational staging point.\n- Vulnerable to enemy armor, artillery, and air assets when employed in open terrain.\n- Vulnerable to enemy chemical, biological, radiological, and nuclear (CBRN) attacks with limited decontamination capability"))
            put("A4_2", Questions(subject, category, "SBCT Battalion","ic_sbct_bn"))
            put("A4_3", Questions(subject, category, "SBCT Company","ic_sbct_co"))
            put("A4_4", Questions(subject, category, "Stryker Weapon Systems","1) MK 19\n2) .50 CAL\n3) MGS (105mm Mobile Gun System)\n4) ATGM (TOW-ITAS)\n5) M240B"))
            put("A4_5", Questions(subject, category, "10 Types of Strykers","M1126 - (ICV) Infantry Carrier Vehicle\nM1127 - (RV) Reconnaissance Vehicle\nM1128 - (MGS) Mobile Gun System\nM1129 - (MCV) 120mm Mounted Mortar Carrier\nM1130 - (CV) Commander's Vehicle\nM1131 - (FSV) Fire Support Vehicle\nM1132 - (ESV) Engineer Squad Vehicle\nM1133 - (MEV) Medical Evacuation Vehicle\nM1134 - (ATGM) Anti-Tank Guided Missle\nM1135 - (NBCRV) NBC Reconnaissance Vehicle\n"))
            put("A4_6", Questions(subject, category, "Mortar Systems in an SBCT Company","- 2x 120mm MCVs\n- 2x dismounted 60mm mortars\n- only 2 of the 4 total systems can be employed at the same time"))
            put("A4_7", Questions(subject, category, "Company Intelligence Support Team (COIST)","Team that analyzes and reports information collected by the company while receiving, parsing, and reporting intelligence collected by both adjacent and higher units."))
        }
    }

    private fun loadUrbanOperations(subject: String) {
        val category = "Urban Operations"
        with(questionsDeck) {
            put("A4_8", Questions(subject, category,"Reasons to conduct urban operations", "- Urban areas contain critical industrial or economic facilities that need to be controlled.\n- Urban areas contain critical transportation infrastructure (such as bridges, railways, and road networks) that provide an advantage to the side that controls them.\n- Use of port or airfield facilities should be denied to enemy forces.\n- The political importance of an urban area, such as a capital, justifies its liberation or capture.\n- Attacking an urban area could have a decisive psychological impact on the enemy or significantly motivate the friendly population within the city."))
            put("A4_9", Questions(subject, category,"Reasons to not conduct urban operations", "- Friendly objectives lay beyond the urban area, a bypass of the urban area exists, or speed or time is essential.\n- An urban area exerts no substantial threat or its threat can be contained.\n- Sufficient force is not available to attack, clear, and then hold the urban area, or the attack cannot be logistically supported.\n- An urban area is declared an open city to prevent civilian casualties or to preserve cultural or historical sites."))
            put("A4_10", Questions(subject, category,"Types of Urban Operations", "1) High intensity (conventional - low intel/ unrestrictive ROE)\n2) Precision (conventional/SOF - avg intel/ semi-restrictive ROE)\n3) Surgical (SOF - high intel/ restrictive ROE)"))
            put("A4_11", Questions(subject, category,"Fundamentals of Urban Operations", "1) Perform aggressive IO\n2) Maintain close combat\n3) Control the essentials\n4) Minimize collateral damage\n5) Separate combatants and noncombatants\n6) Preserve critical infrastructure\n7) Restore essential services\n8) Understand the human dimension\n9) Create collaborative information environment\n10) Transition control"))
            put("A4_12", Questions(subject, category,"Types of Urban Areas", "1) City Corps\n2) Core Periphery\n3) High Rise Residential Areas\n4) Commercial Areas\n5) Industrial Areas\n6) Military Areas\n7) Low Rise Residential Areas\n8) Strip Areas"))
            put("A4_13", Questions(subject, category,"Major Street Patterns", "1) Satellite\n2) Linear\n3) Network\n4) Segment"))
            put("A4_14", Questions(subject, category,"Minor Street Patterns", "1) Radial\n2) Irregular\n3) Grid"))
            put("A4_15", Questions(subject, category,"Building Framing Methods", "1) Heavy Clad - Block, brick, stone\n2) Light Clad - Thin brick, light-weight concrete, glass"))
            put("A4_16", Questions(subject, category,"Types of Buildings by Frame", "1) Mass Construction\n2) Framed Construction"))
            put("A4_17", Questions(subject, category,"Dimensions of the Urban Battlespace (Surfaces)", "1) Martime\n2) Air Space\n3) Surface\n4) Super-Surface\n5) Sub-Surface"))
            put("A4_18", Questions(subject, category,"Martime", "Waterways in a battle space"))
            put("A4_19", Questions(subject, category,"Air Space", "Conventional aircraft or quad-copter"))
            put("A4_20", Questions(subject, category,"Surface", "Top level that includes 1st floor in buildings"))
            put("A4_21", Questions(subject, category, "Super-Surface","2nd Floor and Above"))
            put("A4_22", Questions(subject, category,"Sub-Surface", "Subway, sewer, cellars, etc."))
            put("A4_23", Questions(subject, category,"Urban Operations", "Operations across the range of military operations planned and conducted on, or against objectives on a topographical complex and its adjacent natural terrain, where man-made construction or the density of population are the dominant features."))
            put("A4_24", Questions(subject, category,"5x Urban Terrain Categories with Corresponding Population Size", "1) Village - < 3k\n2) Town - 3k - 100k\n3) City - 100k - 1 mil\n4) Metropolis - 1-10 mil\n5) Megalopolis - 10 mil"))
        }
    }

    private fun loadA4Breaching(subject: String) {
        val category = "Breaching"
        with(questionsDeck) {
            put("A4_25", Questions(subject, category,"Types of Isolation", "1) Physical\n2) Direct fire\n3) Indirect fire\n4) Observation\n5) Combination"))
            put("A4_26", Questions(subject, category,"Isolation Requires a Unit to Seal Off the Enemy", "1) Physically\n2) Psychologically\n3) Electronically"))
            put("A4_27", Questions(subject, category,"Breaching Methods", "1) Mechanical\n2) Ballistic\n3) Explosive\n4) Manual"))
            put("A4_28", Questions(subject, category,"Breaching Categories", "1) Close In\n2) Distance Breach"))
            put("A4_29", Questions(subject, category,"Task Organization for a Breach", "1) Assault\n2) Support\n3) Reserve\n4) Breach"))
        }
    }

    private fun loadA4Offense(subject: String) {
        val category = "Offense"
        with(questionsDeck) {
            put("A4_30", Questions(subject, category,"MCCC Steps of a Deliberate Attack", "1) Recon OBJ\n2) Move to OBJ\n3) Isolate OBJ\n4) Secure a Foothold\n5) Clear the Urban Area\n6) Consolidate and Reorganize\n7) Prepare for Future Ops"))
        }
    }

    private fun loadA4OPFOR(subject: String) {
        val category = "OPFOR"
        with(questionsDeck) {
            put("A4_31", Questions(subject, category,"Types of Ambushes", "1) Annihilation - Destroy BLUFOR forces\n2) Harrassment - Disrupt BLUFOR\n3) Containment - Part of larger operation to contain BLUFOR"))
            put("A4_32", Questions(subject, category,"Types of Enemy Battle Positions", "1) Simple battle position\n2) Complex battle position"))
            put("A4_33", Questions(subject, category,"Simple Battle Position", "A defensive location oriented on the most likely enemy avenue of approach; not necessarily tied to complex terrain."))
            put("A4_34", Questions(subject, category,"Complex Battle Position", "A defensive location designed to employ a combination of complex terrain and engineer efforts to protect unit within them from detection and attack; not necessarily tied to an avenue of approach"))
            put("A4_35", Questions(subject, category,"3 Enemy Combat Zones", "1) Disruption zone\n2) Main battle zone\n3) Support zone"))
            put("A4_36", Questions(subject, category,"OPFOR Task Organization Elements for the Defense", "1) Disruption Element\n2) Main Defense Element\n3) Reserve Element\n4) Support Element"))
            put("A4_37", Questions(subject, category,"Tasks for Combat Security Outpost (CSOP)", "- Ambush\n- Attack by Fire\n- Delay\n- Disrupt\n- Fix"))
            put("A4_38", Questions(subject, category,"Complex Battle Positions Characteristics", "- 360-degree fire coverage & protection from attack.\n- Sanctuary from which to launch local attacks.\n- Any existing AAs are easily observable by the defender.\n- Limited AAs.\n- Large logistics caches.\n- Engineer effort prioritizing C3D measures; limited countermobility effort that might reveal the CBP location."))
            put("A4_39", Questions(subject, category,"Hybrid Threat", "A hybrid threat is the diverse and dynamic combination of regular forces, irregular forces, terrorist forces, or criminal elements unified to achieve mutually benefiting effects."))
        }
    }

    // 5. B1
    private fun loadB1Questions(subject: String) {

    }

    // 6. B2
    private fun loadB2Questions(subject: String) {

    }

    // 7. B3
    private fun loadB3Questions(subject: String) {

    }

    // 8. B4
    private fun loadB4Questions(subject: String) {

    }

    // 9. Final Exam
    private fun loadFinalExamQuestions(subject: String) {

    }
}