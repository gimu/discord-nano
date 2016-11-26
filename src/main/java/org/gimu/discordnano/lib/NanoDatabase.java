/*
 *  Copyright 2016 Son Nguyen <mail@gimu.org>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.gimu.discordnano.lib;

import org.gimu.discordnano.DiscordNano;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NanoDatabase {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/discord?user=" + DiscordNano.DB_USER + "&password=" + DiscordNano.DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
