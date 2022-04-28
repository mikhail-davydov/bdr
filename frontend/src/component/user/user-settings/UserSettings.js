import {Component} from "react";
import {UserSettingsItem} from "../user-settings-item/UserSettingsItem";

import "./UserSettings.css";

export class UserSettings extends Component {

    constructor(props) {
        super(props);
        this.state = {
            userSettings: [
                {
                    id: 1, name: "Настройки"
                },
                {
                    id: 2, name: "Компании"
                }
            ]
        }
    }

    render() {
        return (
            <ul className={this.getUserSettingsClassName()}>
                {this.getUserSettings()}
            </ul>
        )
    }

    getUserSettings() {
        return this.state.userSettings
            .map((setting) =>
                <UserSettingsItem key={setting.id}
                                  onClick={this.props.onClickItem}
                                  content={setting.name}

                />
            );
    }

    getUserSettingsClassName() {
        return this.props.isVisible ? "user-settings visible" : "user-settings";
    }

}