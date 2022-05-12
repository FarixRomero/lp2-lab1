using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LP2Clinica
{
    public partial class PrincipalCliente : Form
    {
        Form formularioActivo=null;
        private bool CerrandoSesion=false;
        public PrincipalCliente()
        {
            InitializeComponent();
        }
        public void abrirFormulario(Form formularioMostrar)
        {
            if (formularioActivo != null)
                formularioActivo.Close();
            formularioActivo = formularioMostrar;
            formularioMostrar.TopLevel = false;
            formularioMostrar.FormBorderStyle = FormBorderStyle.None;
            formularioMostrar.Dock = DockStyle.Fill;
            panelContenedor.Controls.Add(formularioMostrar);
            formularioMostrar.Show();
        }


        private void PrincipalCliente_FormClosed(object sender, FormClosedEventArgs e)
        {
            if (!CerrandoSesion) Application.ExitThread();
        }

        private void btnModificarCuenta_Click(object sender, EventArgs e)
        {
            abrirFormulario(new frmModificarDatos());
        }

        private void btnBuscarMedico_Click(object sender, EventArgs e)
        {
            abrirFormulario(new frmMostrarPerfilDoctores());
        }

        private void btnVerPerfil_Click(object sender, EventArgs e)
        {
            frmMostrarPerfil mostrarperfil = new frmMostrarPerfil();
            mostrarperfil.SetPrincipal(this);
            abrirFormulario(mostrarperfil);
        }

        private void btnReservarCita_Click(object sender, EventArgs e)
        {

        }

        private void btnCerrarSesion_Click(object sender, EventArgs e)
        {
            DialogResult respuesta = MessageBox.Show("¿Está seguro que deseas salir de tu sesión?",
                "Cerrando Sesion", MessageBoxButtons.YesNo,
                MessageBoxIcon.Question);
            if (respuesta == DialogResult.Yes)
            {
                CerrandoSesion = true;
                Inicio comienzo = new Inicio();
                comienzo.Show();
                this.Close();   
            }
        }
    }
    
}
