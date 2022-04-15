import {Component} from "react";
import Button from "../button/Button";
import CompanyListItem from "../company/__list-item/CompanyListItem";
import CompanyList from "../company/__list/CompanyList";
import Company from "../company/Company";
import User from "../user/User";
import {UserSettingsItem} from "../user/user-settings-item/UserSettingsItem";
import {UserSettings} from "../user/user-settings/UserSettings";

import "./Header.css";

class Header extends Component {

    constructor(props) {
        super(props);
        this.clickUserButton = this.clickUserButton.bind(this);
        this.clickUserSettingItem = this.clickUserSettingItem.bind(this);
        this.clickCompanyButton = this.clickCompanyButton.bind(this);
        this.clickCompanyItem = this.clickCompanyItem.bind(this);
        this.state = {
            userSettingsVisible: false,
            companiesVisible: false,
            userSettings: [
                {
                    id: 1, name: "Настройки"
                },
                {
                    id: 2, name: "Компании"
                }
            ],
            companies: [
                {
                    id: 0, name: "Создать Компанию", isVisible: true,
                }
            ]
        }
    }

    render() {
        let userContent = this.getUserContent();
        let userSettings = this.getUserSettings();
        let userSettingsClassName = this.getUserSettingsClassName();

        let companyContent = this.getCompanyContent();
        let companies = this.getCompaniesList();
        let companiesClassName = this.getCompaniesClassName();

        return (
            <header className="header">
                <Button content={userContent} onClick={this.clickUserButton}/>
                <UserSettings className={userSettingsClassName} content={userSettings}/>
                <Button content={companyContent} onClick={this.clickCompanyButton}/>
                <CompanyList className={companiesClassName} content={companies}/>
            </header>
        )
    }

    getUserContent() {
        return <User/>;
    }

    getUserSettingsClassName() {
        return this.state.userSettingsVisible ? "user-settings visible" : "user-settings";
    }

    getUserSettings() {
        return this.state.userSettings
            .map((setting) =>
                <UserSettingsItem key={setting.id}
                                  onClick={this.clickUserSettingItem}
                                  content={setting.name}

                />
            );
    }

    clickUserButton() {
        this.setState({
            userSettingsVisible: !this.state.userSettingsVisible
        })
    }

    clickUserSettingItem() {
        this.setState({
            userSettingsVisible: false
        });
    }

    getCompaniesClassName() {
        return this.state.companiesVisible ? "company__list visible" : "company__list";
    }

    getCompaniesList() {
        return this.state.companies
            .filter(company => !company.isVisible)
            .map((company) =>
                <CompanyListItem key={company.id}
                                 onClick={(e) => this.clickCompanyItem(company.id, this.state.companies, e)}
                                 content={company.name}

                />
            );
    }

    getCompanyContent() {
        let visibleCompany = this.state.companies.find(company => company.isVisible);
        return <Company visibleCompany={visibleCompany.name} chevronUp={this.state.companiesVisible}/>;
    }

    clickCompanyButton() {
        this.setState({
            companiesVisible: !this.state.companiesVisible
        })
    }

    clickCompanyItem(key, companiesList) {
        companiesList.forEach(company => {
            company.isVisible = (company.id === key);
        });

        this.setState({
            companies: companiesList,
            companiesVisible: false
        });
    }

    componentDidMount() {
        this.setState({
            //todo: fetch list from db
            companies: [
                {
                    id: 1, name: "Компания 1", isVisible: false,
                }, {
                    id: 2, name: "Другая Компания", isVisible: false,
                }, {
                    id: 3, name: "ООО Ромашка", isVisible: true,
                },
            ]
        })
    }

}

export default Header;
