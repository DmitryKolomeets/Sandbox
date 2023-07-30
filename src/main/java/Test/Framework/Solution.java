//package Test.Framework;
//
//public class Solution {
//
//    <code_scheme name="spring-framework">
//	<option name="OTHER_INDENT_OPTIONS">
//		<value>
//			<option name="INDENT_SIZE" value="4"/>
//			<option name="CONTINUATION_INDENT_SIZE" value="8"/>
//			<option name="TAB_SIZE" value="4"/>
//			<option name="USE_TAB_CHARACTER" value="true"/>
//			<option name="SMART_TABS" value="false"/>
//			<option name="LABEL_INDENT_SIZE" value="0"/>
//			<option name="LABEL_INDENT_ABSOLUTE" value="false"/>
//			<option name="USE_RELATIVE_INDENTS" value="false"/>
//		</value>
//	</option>
//	<option name="CLASS_COUNT_TO_USE_IMPORT_ON_DEMAND" value="50"/>
//	<option name="NAMES_COUNT_TO_USE_IMPORT_ON_DEMAND" value="50"/>
//	<option name="IMPORT_LAYOUT_TABLE">
//		<value>
//			<package name="java" withSubpackages="true" static="false"/>
//			<emptyLine/>
//			<package name="javax" withSubpackages="true" static="false"/>
//			<emptyLine/>
//			<package name="" withSubpackages="true" static="false"/>
//			<emptyLine/>
//			<package name="org.springframework" withSubpackages="true" static="false"/>
//			<emptyLine/>
//			<package name="" withSubpackages="true" static="true"/>
//		</value>
//	</option>
//	<option name="ENABLE_JAVADOC_FORMATTING" value="false"/>
//	<option name="JD_ALIGN_PARAM_COMMENTS" value="false"/>
//	<option name="JD_ALIGN_EXCEPTION_COMMENTS" value="false"/>
//	<option name="JD_KEEP_EMPTY_LINES" value="false"/>
//	<XML>
//		<option name="XML_LEGACY_SETTINGS_IMPORTED" value="true"/>
//	</XML>
//	<codeStyleSettings language="Groovy">
//		<indentOptions>
//			<option name="USE_TAB_CHARACTER" value="true"/>
//		</indentOptions>
//	</codeStyleSettings>
//	<codeStyleSettings language="JAVA">
//		<option name="KEEP_BLANK_LINES_BEFORE_RBRACE" value="1"/>
//		<option name="BLANK_LINES_AROUND_FIELD" value="1"/>
//		<option name="BLANK_LINES_AROUND_FIELD_IN_INTERFACE" value="1"/>
//		<option name="ELSE_ON_NEW_LINE" value="true"/>
//		<option name="CATCH_ON_NEW_LINE" value="true"/>
//		<option name="FINALLY_ON_NEW_LINE" value="true"/>
//		<option name="ALIGN_MULTILINE_PARAMETERS" value="false"/>
//		<option name="SPACE_BEFORE_ARRAY_INITIALIZER_LBRACE" value="true"/>
//		<option name="KEEP_SIMPLE_BLOCKS_IN_ONE_LINE" value="true"/>
//		<option name="KEEP_MULTIPLE_EXPRESSIONS_IN_ONE_LINE" value="true"/>
//		<option name="FIELD_ANNOTATION_WRAP" value="1"/>
//		<indentOptions>
//			<option name="USE_TAB_CHARACTER" value="true"/>
//		</indentOptions>
//		<arrangement>
//			<groups>
//				<group>
//					<type>GETTERS_AND_SETTERS</type>
//					<order>KEEP</order>
//				</group>
//			</groups>
//			<rules>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PUBLIC</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PROTECTED</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PACKAGE_PRIVATE</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PRIVATE</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PUBLIC</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PROTECTED</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PACKAGE_PRIVATE</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PRIVATE</MODIFIER>
//							<MODIFIER>STATIC</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PUBLIC</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PROTECTED</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PACKAGE_PRIVATE</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PRIVATE</MODIFIER>
//							<MODIFIER>FINAL</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PUBLIC</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PROTECTED</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PACKAGE_PRIVATE</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>FIELD</TYPE>
//							<MODIFIER>PRIVATE</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<TYPE>FIELD</TYPE>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<TYPE>CONSTRUCTOR</TYPE>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>METHOD</TYPE>
//							<MODIFIER>STATIC</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<TYPE>METHOD</TYPE>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<TYPE>ENUM</TYPE>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<TYPE>INTERFACE</TYPE>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<AND>
//							<TYPE>CLASS</TYPE>
//							<MODIFIER>STATIC</MODIFIER>
//						</AND>
//					</match>
//				</rule>
//				<rule>
//					<match>
//						<TYPE>CLASS</TYPE>
//					</match>
//				</rule>
//			</rules>
//		</arrangement>
//	</codeStyleSettings>
//	<codeStyleSettings language="XML">
//		<indentOptions>
//			<option name="USE_TAB_CHARACTER" value="true"/>
//		</indentOptions>
//	</codeStyleSettings>
//</code_scheme>
//}
