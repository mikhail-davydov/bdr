import {Component} from "react";

import "./CompanyList.css";

class CompanyList extends Component {

    render() {
        let companyListClassName = this.getCompaniesClassName();
        return (
            <ul className={companyListClassName}>
                {this.props.content}
            </ul>
        )
    }

    getCompaniesClassName() {
        return this.props.isVisible ? "company__list visible" : "company__list";
    }

}

export default CompanyList;